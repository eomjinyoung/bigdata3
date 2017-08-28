/* 액티비티 생명주기(lifecycle)
1) 상태1 - 액티비티 실행
   - onCreate()
   - onStart()
   - onResume()
2) 상태2 - 실행 중
   - onPause() : 다른 액티비티가 현재 액티비티 앞에서 실행할 때
     예) 현재 앱 앞에 밧데리 부족을 알리는 대화창을 떴을 때
         현재 앱은 대화창 뒤에서 흐릿하게 보여지는 상태이다.
     => 대화 상자를 닫고 다시 이전 액티비티로 돌아오면,
        onResume()을 호출한다.
   - onStop() : 액티비티를 보여줄 수 없을 때
     예) 유투브 앱 실행 중에 메신저 앱을 띄우면 유투브 앱은 영상 출력을 멈춘다.
     => onRestart() : 다시 액티비티를 출력할 때
                      onRestart() 호출 후,
                      onStart()를 다시 호출한다.
   - onDestroy() : 앱을 종료할 때
3) 상태3 - 액티비티 종료

4) 앱 강제 종료
   - 다른 앱을 실행하기 위해 메모리를 확보할 때
     기존에 실행되고 있지 않은 앱을 강제로 종료한다.
   => 사용자가 앱을 보려고 종료된 앱을 선택하면,
      onCreate()를 호출하여 처음 실행하는 것처럼 동일하게 동작한다.

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

        Log.v(TAG, "onCreate() 호출됨!");
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "onStart() 호출됨!");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "onResume() 호출됨!");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "onPause() 호출됨!");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "onStop() 호출됨!");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestroy() 호출됨!");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "onRestart() 호출됨!");
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
