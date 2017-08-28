// 로그인 액티비티
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

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

        Log.v(TAG, email);
        Log.v(TAG, password);

        this.finish();
    }
}
