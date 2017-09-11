/* Activity 실행
=> startActivity()를 호출할 때 마다 새 액티비티가 실행된다.
   기본에 같은 이름의 액티비티가 있다하더라도 새로 액티비티를 중복 실행한다.
=> 해결 방법?
   FLAG 를 이용하여 액티비티 실행을 조정할 수 있다.
=> Activity 플래그
1) Intent.FLAG_ACTIVITY_SINGLE_TOP
   - 현재 최상위 액티비티로 실행중에 있다면 다시 실행하지 않는다.
   - 이미 최상위에 액티비티가 실행중에 있을 경우,
     같은 액티비티를 중복 실행하지 않으려면 이 플래그를 붙여라!
2) Intent.FLAG_ACTIVITY_CLEAR_TOP
   - 최상위에는 없지만 다른 액티비티 아래에 깔린 상태일 때,
     기존 액티비티를 다시 화면의 맨 위로 올리고 싶다면 이 플래그를 사용하라!
   - 기존 액티비티를 출력하기 위해 그 위에 있던 모든 액티비티들이 제거된다.


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


}
