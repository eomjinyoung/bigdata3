/* 액티비티와 데이터 주고 받기
1) 다른 액티비티로 문자열 및 원시 데이터 값 보내고 받기
   - Intent.putExtra(key, value)
   - Intent.getExtras().getXxx(key)

2) 다른 액티비티가 보낸 값을 받기
   - startActivityForResult(content, requestCode)
   - onActivityResult()

3) 다른 액티비티에게 객체를 보내기
   - 액티비티에게 보낼 객체는 Parcelable 인터페이스 구현체여야 한다.
   - Intent.putExtra(key, 객체)
   - Intent.getExtras().getParcelable(key)

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";
    public static final int REQ_SUB2ACTIVITY = 100;
    public static final int REQ_SUB3ACTIVITY = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this, Sub1Activity.class);
        intent.putExtra("name", "홍길동");
        intent.putExtra("age", 20);
        this.startActivity(intent);
    }

    public void onButton2Click(View v) {
        Intent intent = new Intent(this, Sub2Activity.class);
        intent.putExtra("name", "홍길동");
        intent.putExtra("age", 20);
        this.startActivityForResult(intent, REQ_SUB2ACTIVITY);
    }

    public void onButton3Click(View v) {
        Member member = new Member(1, "홍길동", "hong@test.com", "1111");

        Intent intent = new Intent(this, Sub3Activity.class);
        intent.putExtra("member", member);
        this.startActivityForResult(intent, REQ_SUB3ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 이 메서드는 startActivityForResult()를 통해 실행한
        // 액티비티로부터 데이터를 받을 때 호출된다.
        // 데이터를 보낸 액티비티는 requestCode를 사용하여 구분한다.
        if (requestCode == REQ_SUB2ACTIVITY) {
            Log.v(TAG, String.format("name=%s", data.getExtras().getString("name")));
            Log.v(TAG, String.format("age=%d", data.getExtras().getInt("age")));
        }
    }
}
