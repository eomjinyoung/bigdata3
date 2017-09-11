/* 서비스 만들고 실행하기
=> 만드는 방법
   - Service를 상속 받아 만든다.
   - AndroidManifest.xml 파일에 <service> 태그를 추가한다.

=> 실행하는 방법
   방법 1) startService()를 호출한다.
   방법 2) bindService()를 호출한다.

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Log.d(TAG, ".onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ".onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, ".onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, ".onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, ".onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ".onDestroy()");
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }

    public void onButton2Click(View v) {
        // 서비스 객체 실행
        Intent intent = new Intent(getApplicationContext(), MyService1.class);
        startService(intent);

        // => startService()를 호출하면
        // 1) MyService1 객체가 없을 경우,
        //    - 객체를 생성 ==> onCreate() ==> onStartCommand()
        //
        // 2) MyService1 객체가 있을 경우,
        //    - onStartCommand()
    }

    public void onButton3Click(View v) {
        // 서비스 객체 실행
        Intent intent = new Intent(getApplicationContext(), MyService2.class);
        startService(intent);

        // MainActivity가 종료되었다 하더라도 MyService2는 밑단(background)에서
        // 계속 실행할 것이다.
        this.finish();
    }


}
