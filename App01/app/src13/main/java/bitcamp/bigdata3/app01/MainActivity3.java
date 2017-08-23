/* 이벤트 다루기 III
=> 이벤트 핸들러(리스너)에서 이벤트가 발생된 객체를 구분하기

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("MainActivity3");
    }

    // button1, button2, button3의 클릭 이벤트가 발생했을 때 이 메서드가 호출된다.
    public void onButtonClick(View v) {
        if (v.getId() == R.id.button1) {
            Toast.makeText(this, "하하하", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button2) {
            Toast.makeText(this, "여름이 지나가고 있다!", Toast.LENGTH_SHORT).show();
        }
    }
}
