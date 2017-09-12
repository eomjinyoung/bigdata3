/* 장비에서 알림 받기
 */
package bitcamp.bigdata3.app01;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import bitcamp.bigdata3.app01.util.RESTful;
import bitcamp.bigdata3.app01.util.Utils;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();
    EditText etEmail;
    EditText etPassword;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        //=> 처음 화면을 출력할 때 미리 email, password 입력 상자를 알아낸다.
        etEmail = (EditText) this.findViewById(R.id.etEmail);
        etPassword = (EditText) this.findViewById(R.id.etPassword);

        Intent intent = getIntent();
        processData(intent);
    }

    public void onButtonLoginClick(View v) {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        Log.d(TAG, "email=" + email + ", password=" + password);

        // => 공용 보관소를 얻는다.
        SharedPreferences sharedPref = this.getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        // => 공용 보관소에서 값을 꺼낸다.
        token = sharedPref.getString(getString(R.string.fcm_token), "");

        Log.d(TAG, "token=" + token);

        // => 서버에 로그인 요청을 한다.
        new UserControlTask().execute(email, password, token);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processData(intent);
    }

    protected void processData(Intent intent) {
        if (intent.getStringExtra("message") != null) {
            Toast.makeText(getApplicationContext(),
                    intent.getStringExtra("message"),
                    Toast.LENGTH_LONG).show();
        }
    }


    class UserControlTask extends AsyncTask<String, Void, Boolean> {
        @Override
        protected Boolean doInBackground(String... params) {
            try {
                String url = String.format(
                    "http://192.168.0.6:8080/user/json/login?email=%s&password=%s&token=%s",
                    params[0], params[1], params[2]);

                JSONObject result = RESTful.getJSON(url);
                Log.v(TAG, "로그인 결과: " + result.getString("state"));

                if (result.getString("state").equals("success")) {
                    return true;
                } else {
                    return false;
                }

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
            }
            return false;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result) {
                Toast.makeText(getApplicationContext(),
                        "로그인 성공!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "로그인 실패!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
