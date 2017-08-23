/* 이벤트 다루기 VIII
=> 자바 코드로 이벤트 핸들러 등록하기
=> 액티비티가 이벤트 핸드러의 역할도 함께 한다.
   단, OnClickListener 처럼 메서드가 한, 두 개일 경우에 적합하다.

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

// MainActivity8은 click 이벤트의 핸들러 역할도 한다.
public class MainActivity8 extends AppCompatActivity
        implements View.OnClickListener {

    public void onClick(View v) { // OnClickListener 인터페이스에 선언된 메서드
        if (v.getId() == R.id.button1) {
            Toast.makeText(this, "하하하", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button2) {
            Toast.makeText(this, "여름이 지나가고 있다!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setTitle("MainActivity8");

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }
}
