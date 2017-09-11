/* 서비스 만들기
=> 종류
1) 일반 서비스
   - startService()를 호출하여 서비스를 시작시킨다.
2) 바인드된 서비스
   - bindService()를 호출하여 서비스를 시작시킨다.


 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Log.d(TAG, "MainActivity.onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity.onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity.onDestroy()");
    }

    public void onButton1Click(View v) {

    }

    public void onButton2Click(View v) {

    }
}
