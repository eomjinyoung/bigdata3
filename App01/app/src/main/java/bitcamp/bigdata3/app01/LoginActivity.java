// 로그인 액티비티
package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = LoginActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginButtonClick(View v) {
        String email = ((EditText)this.findViewById(R.id.email)).getText().toString();
        String password = ((EditText)this.findViewById(R.id.password)).getText().toString();

        new LoginRequestTask().execute(email, password);
    }

    class LoginRequestTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL(String.format(
                        "http://192.168.0.6:8080/auth/json/login?email=%s&password=%s",
                        params[0], params[1]));
                URLConnection urlConnection = url.openConnection();

                Scanner in = new Scanner(urlConnection.getInputStream());
                StringBuffer buf = new StringBuffer();
                while (in.hasNext()) {
                    buf.append(in.nextLine());
                }
                return buf.toString();

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }

            return null;
        }

        @Override
        protected void onPostExecute(String json) {
            try {
                if (json == null)
                    throw new Exception("서버 요청 오류!");

                JSONObject jsonObject = new JSONObject(json); // 문자열 ==> 자바 객체
                Log.v(TAG, jsonObject.getString("state"));

                JSONObject member = jsonObject.getJSONObject("data");
                Log.v(TAG, member.getString("name"));

                JSONArray photoList = member.getJSONArray("photoList");
                for (int i = 0; i < photoList.length(); i++) {
                    Log.v(TAG, photoList.getString(i));
                }

                Toast.makeText(LoginActivity.this, "로그인 성공!", Toast.LENGTH_LONG).show();

            } catch (Exception e) {
                Toast.makeText(LoginActivity.this,
                        "로그인 오류!", Toast.LENGTH_LONG).show();

                // 어떤 오류인지 자세한 내용은 로그로 출력한다.
                StringWriter out = new StringWriter();
                e.printStackTrace(new PrintWriter(out));
                Log.e(TAG, out.toString());
            }
            LoginActivity.this.finish();
        }
    }
}
