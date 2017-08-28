/* Log 사용법
=> 개발하는 동안 작업의 상태를 추적하기 위해 Log를 사용한다.
=> Log를 사용하여 출력한 문자열은 "logcat" 콘솔창에 출력된다.
=> 로그를 출력할 때 레벨을 지정한다.
   ERROR, WARN, INFO, DEBUG, VERBOSE
   -ERROR(6) : 앱의 기능을 정상적으로 수행하는데 오류가 발생했을 때 출력하는 로그
   -WARN(5) : 앱의 실행에는 문제가 없으나 사용자에게 알려야 할 때 출력하는 로그
   -INFO(4) : 앱의 실행 정보를 중간 중간 간단히 출력할 때 사용
   -DEBUG(3) : 앱을 개발하는 동안 개발자가 관심있어 하는 값을 출력할 때 사용
   -VERBOSE(2) : 앱의 실행 상태를 상세히 출력할 때 사용

=> 로그 필터링
   로그 중에서 특정 레벨의 로그를 제한해서 보는 것
   로그 레벨을 선택하면, 그 레벨 값 이상의 레벨을 모두 출력한다.
   예1) ERROR 레벨을 필터링 하면, ERROR 레벨의 로그만 출력한다.
   예2) INFO 레벨을 필터링 하면, INFO/WARN/ERROR 레벨의 모든 로그를 출력한다.
   예3) VERBOSE 레벨을 필터링 하면, VERBOSE 보다 큰 모든 레벨의 로그를 출력한다.

=> 로그 사용법 정리
   - 개발하는 동안 중요하지 않은 정보를
     로그를 남기로 싶을 때는 VERBOSE 레벨로 출력하라!
   - 개발자가 반드시 알아야 할 내용은 DEBUG 레벨로 출력하라!

=> logcat(로그캣)
   - 앱을 실행하는 동안 실행 정보를 출력하는 창
   - 로그를 출력할 때 사용한 태그나, 특정 키워드로 로그 내용을 필터링할 수 있다.

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Log.v(TAG, "[VERBOSE] onCreate() 호출됨!");
        Log.d(TAG, "[DEBUG] onCreate() 호출됨!");
        Log.i(TAG, "[INFO] onCreate() 호출됨!");
        Log.w(TAG, "[WARN] onCreate() 호출됨!");
        Log.e(TAG, "[ERROR] onCreate() 호출됨!");
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "[VERBOSE] onStart() 호출됨!");
        Log.d(TAG, "[DEBUG] onStart() 호출됨!");
        Log.i(TAG, "[INFO] onStart() 호출됨!");
        Log.w(TAG, "[WARN] onStart() 호출됨!");
        Log.e(TAG, "[ERROR] onStart() 호출됨!");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "[VERBOSE] onResume() 호출됨!");
        Log.d(TAG, "[DEBUG] onResume() 호출됨!");
        Log.i(TAG, "[INFO] onResume() 호출됨!");
        Log.w(TAG, "[WARN] onResume() 호출됨!");
        Log.e(TAG, "[ERROR] onResume() 호출됨!");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "[VERBOSE] onPause() 호출됨!");
        Log.d(TAG, "[DEBUG] onPause() 호출됨!");
        Log.i(TAG, "[INFO] onPause() 호출됨!");
        Log.w(TAG, "[WARN] onPause() 호출됨!");
        Log.e(TAG, "[ERROR] onPause() 호출됨!");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "[VERBOSE] onStop() 호출됨!");
        Log.d(TAG, "[DEBUG] onStop() 호출됨!");
        Log.i(TAG, "[INFO] onStop() 호출됨!");
        Log.w(TAG, "[WARN] onStop() 호출됨!");
        Log.e(TAG, "[ERROR] onStop() 호출됨!");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "[VERBOSE] onDestroy() 호출됨!");
        Log.d(TAG, "[DEBUG] onDestroy() 호출됨!");
        Log.i(TAG, "[INFO] onDestroy() 호출됨!");
        Log.w(TAG, "[WARN] onDestroy() 호출됨!");
        Log.e(TAG, "[ERROR] onDestroy() 호출됨!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "[VERBOSE] onRestart() 호출됨!");
        Log.d(TAG, "[DEBUG] onRestart() 호출됨!");
        Log.i(TAG, "[INFO] onRestart() 호출됨!");
        Log.w(TAG, "[WARN] onRestart() 호출됨!");
        Log.e(TAG, "[ERROR] onRestart() 호출됨!");
        super.onRestart();
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this, MyDialogActivity.class);
        this.startActivity(intent);
    }

    public void onButton2Click(View v) {
        Intent intent = new Intent(this, OtherActivity.class);
        this.startActivity(intent);
    }
}
