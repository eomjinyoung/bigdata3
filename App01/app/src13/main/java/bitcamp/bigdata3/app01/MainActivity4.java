/* 이벤트 다루기 IV
=> 자바 코드로 이벤트 핸들러 등록하기

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setTitle("MainActivity4");

        // 버튼에 이벤트 핸들러 등록하기
        // => 일단 버튼 객체를 알아낸다.
        MyOnClickListener listener = new MyOnClickListener();

        findViewById(R.id.button1).setOnClickListener(listener);
        findViewById(R.id.button2).setOnClickListener(listener);
        findViewById(R.id.button3).setOnClickListener(listener);

        /*
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(listener);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(listener);

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(listener);
        */
    }

    // 버튼의 click 이벤트가 발생했을 때 작업을 수행할 클래스 정의
    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) { // OnClickListener 인터페이스에 선언된 메서드
            if (v.getId() == R.id.button1) {
                Toast.makeText(MainActivity4.this, "하하하", Toast.LENGTH_SHORT).show();
            } else if (v.getId() == R.id.button2) {
                Toast.makeText(MainActivity4.this, "여름이 지나가고 있다!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
