/* 액티비티와 데이터 주고 받기
1) 다른 액티비티로 문자열 보내기

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this, Sub1Activity.class);
        this.startActivity(intent);
    }
}
