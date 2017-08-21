/* 버튼의 클릭 이벤트 처리
=> activity_main.xml 파일에 TextView 대신 Button UI를 지정한다.
=> 버튼 클릭했을 때 호출될 메서드명을 설정한다.
   onClick 프로퍼티의 값을 "onButtonClick"으로 설정한다.
=> MainActivity에 onButtonClick() 메서드를 만든다.

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setContentView()
        // => 액티비티의 빈 화면에 UI를 출력하는 일을 한다.
        // 이 메서드의 파라미터 값으로 레이아웃 XML 파일의 아이디를 주면
        // 이 메서드가 해당 XML 파일을 찾아
        // 그 XML 파일에 설정된 대로 UI 객체를 만들고,
        // 화면에 출력한다.
    }

    // 보통 UI 객체에서 이벤트가 발생하면 그 이벤트를 처리할 메서드를 호출한다.
    // 이 메서드를 "이벤트 리스너" 또는 "이벤트 핸들러"라 부른다.
    // 이벤트 리스너(=이벤트 핸들러)는 파라미터 값으로 UI 객체를 받는다.
    // 안드로이드에서는 모든 UI 객체가 View 클래스의 하위 클래스이다.
    public void onButtonClick(View view) {
        // 버튼을 누르면, 간단히 안내말을 출력하는 창을 띄워보자!
        Toast msgBox = Toast.makeText(
                this.getApplicationContext(), "눌렀음!", Toast.LENGTH_LONG);
        msgBox.show();

        /* 참고!
           => 안드로이드에서 UI를 다룰 때는 항상 앱의 환경정보가 필요하다.
           => 앱에 대한 환경 정보를 얻는 방법?
              액티비트의 getApplicationContext() 메서드를 호출하라!
         */
    }
}
