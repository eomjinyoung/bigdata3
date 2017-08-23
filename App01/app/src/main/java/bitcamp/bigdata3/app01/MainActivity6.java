/* 이벤트 다루기 VI
=> 자바 코드로 이벤트 핸들러 등록하기
=> 익명 클래스 문법을 사용하여 리스너 정의하기

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setTitle("MainActivity6");

        // 버튼의 click 이벤트가 발생했을 때 작업을 수행할 익명 클래스 정의
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) { // OnClickListener 인터페이스에 선언된 메서드
                if (v.getId() == R.id.button1) {
                    Toast.makeText(MainActivity6.this, "하하하", Toast.LENGTH_SHORT).show();
                } else if (v.getId() == R.id.button2) {
                    Toast.makeText(MainActivity6.this, "여름이 지나가고 있다!", Toast.LENGTH_SHORT).show();
                }
            }
        };

        findViewById(R.id.button1).setOnClickListener(listener);
        findViewById(R.id.button2).setOnClickListener(listener);
        findViewById(R.id.button3).setOnClickListener(listener);
    }
}
