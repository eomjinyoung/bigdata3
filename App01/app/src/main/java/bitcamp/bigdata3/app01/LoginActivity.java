// 로그인 액티비티
package bitcamp.bigdata3.app01;

import android.content.Intent;
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
import java.util.ArrayList;
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

                // 로그인 실패 => 안내 문구를 띄운다.
                if (jsonObject.getString("state").equals("fail")) {
                    Toast.makeText(LoginActivity.this,
                            "이메일 또는 암호가 맞지않습니다.",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // 로그인 성공 => 서버에서 받은 데이터를 Member 객체에 담는다.
                //               MainActivity로 리턴한다.
                Member member = new Member();
                JSONObject data = jsonObject.getJSONObject("data");
                member.setNo(data.getInt("no"));
                member.setName(data.getString("name"));
                member.setEmail(data.getString("email"));

                ArrayList<String> photoList = new ArrayList<>();
                JSONArray array = data.getJSONArray("photoList");
                for (int i = 0; i < array.length(); i++) {
                   photoList.add(array.getString(i));
                }
                member.setPhotoList(photoList);

                // 다시 Member 객체를 Intent에 담는다.
                Intent intent = new Intent();
                intent.putExtra("member", member);

                // Intent 객체를 LoginActivity를 실행한 "MainActivity"에게 리턴한다.
                LoginActivity.this.setResult(RESULT_OK, intent);

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
