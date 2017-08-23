/* 이벤트 다루기 I
=> 레이아웃 파일에서 이벤트 핸들러를 설정하기
=> onXxxx 속성에 메서드 이름을 등록한다.
=> 해당 액티비티에 레이아웃에 설정된 이름과 같은 메서드를 정의한다.

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    // 이벤트 핸들러 정의
    public void onButton1Click(View v) {
        Button btn = (Button)v;
        Toast.makeText(this, btn.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onButton2Click(View v) {
        Button btn = (Button)v;
        Toast.makeText(this, btn.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onButton3Click(View v) {
        Button btn = (Button)v;
        Toast.makeText(this, btn.getText(), Toast.LENGTH_SHORT).show();
    }
}
