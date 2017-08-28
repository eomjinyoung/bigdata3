// 로그인 액티비티
package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

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
                URL url = new URL("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
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
        protected void onPostExecute(String result) {
            Log.v(TAG, result);
            LoginActivity.this.finish();
        }
    }
}
