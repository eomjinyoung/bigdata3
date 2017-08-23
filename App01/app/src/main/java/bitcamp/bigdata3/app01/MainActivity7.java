/* 이벤트 다루기 VII
=> 자바 코드로 이벤트 핸들러 등록하기
=> 익명 클래스 문법을 사용하여 리스너 정의하기
   익명 클래스를 메서드 파라미터 부분에 정의한다.

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setTitle("MainActivity7");

        // 이렇게 파라미터에 이벤트를 처리할 리스너를 익명 클래스로 정의하게 되면
        // 코드를 읽고 이해하기가 쉬워진다.
        // 왜? button1의 click 이벤트를 어떻게 처리할 지 바로 알 수 있기 때문이다.
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity7.this, "하하하", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity7.this, "여름이 지나가고 있다!", Toast.LENGTH_SHORT).show();
            }
        });

        // click 했을 때 아무것도 안한다면 리스너를 등록하지 말라!
        //findViewById(R.id.button3).setOnClickListener(listener);
    }
}
