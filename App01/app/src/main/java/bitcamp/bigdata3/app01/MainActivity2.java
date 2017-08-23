/* 이벤트 다루기 II
=> 메서드 한 개에서 모두 처리할 수 있다.
=> 레이아웃에서 이벤트를 처리하는 메서드를 지정할 때
   같은 이름을 설정하라!
=> 주의!
   이 액티비티를 실행하려면 AndroidManifest.xml 파일에서
   메인 액티비트의 이름을 이 액티비티 이름으로 바꿔라!

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("MainActivity2");
    }

    // button1, button2, button3의 클릭 이벤트가 발생했을 때 이 메서드가 호출된다.
    public void onButtonClick(View v) {
        Button btn = (Button) v;
        Toast.makeText(this, btn.getText(), Toast.LENGTH_SHORT).show();
    }
}
