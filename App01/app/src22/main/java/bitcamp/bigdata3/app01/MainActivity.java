/* 서비스 만들고 실행하기
=> 만드는 방법
   - Service를 상속 받아 만든다.
   - AndroidManifest.xml 파일에 <service> 태그를 추가한다.

=> 실행하는 방법
   방법 1) startService()를 호출한다.
   방법 2) bindService()를 호출한다.

 */
package bitcamp.bigdata3.app01;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();
    MyService3 myService3;

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
        //this.finish();
    }

    public void onButton4Click(View v) {
        // 서비스 멈추기
        Intent intent = new Intent(getApplicationContext(), MyService2.class);
        stopService(intent);
    }

    public void onButton5Click(View v) {
        Intent intent = new Intent(getApplicationContext(), MyService3.class);
        // 1번 파라미터: 생성하고 실행할 서비스 클래스 정보
        // 2번 파라미터: 안드로이드 플랫폼에서 서비스를 생성한 후 그 서비스 객체의
        //              주소를 받기 위해 파견 보내는 놈!
        //              파견 보내는 놈은 반드시 ServiceConnection 구현체이어야 한다.
        // 3번 파라미터: 바인더 객체를 자동 생성하도록 설정
        bindService(intent, new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                Log.d(TAG, "onServiceConnected()");
                MyService3.LocalBinder binder = (MyService3.LocalBinder) service;
                myService3 = binder.getService();
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                Log.d(TAG, "onServiceDisconnected()");
            }
        }, Context.BIND_AUTO_CREATE);
    }

    public void onButton6Click(View v) {
        // bindService()를 호출할 때 ServiceConnection을 파견했었다.
        // 안드로이드 플랫폼이 서비스를 만든 후에
        // 파견자 ServiceConnection에게 IBinder를 알려 줬다.
        // 파견자 ServiceConnection은 IBinder를 통해 서비스 객체를 알아내서
        // 액티비티의 변수에 저장하였다.
        // 지금 그 변수를 이용하여 서비스 객체의 메서드를 호출하는 것이다.
        Log.d(TAG, "getValue() ==> " + myService3.getValue());
    }

}
