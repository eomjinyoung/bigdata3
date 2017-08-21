/* 액티비티(Activity)
=> 앱 화면을 담당하는 클래스이다.
=> 실제 화면 설계는 별도의 XML 파일에 둔다.
   액티비티는 화면의 출력을 제어하는 일을 한다.
=> 그래서 보통 액티비티 한 개당 한 개 이상의 XML 파일이 연결된다.
=> 구동 원리
   - 앱을 실행한다.
   - AndroidManifest.xml(web.xml과 유사) 파일에 등록된 액티비트 중에서
     최초 실행해야 하는 액티비티를 찾아 실행한다.
   - 안드로이드는 해당 앱을 위한 빈 화면을 생성한다.
   - 그리고 onCreate()를 호출하여 화면을 초기화할 기회를 준다.
   - 액티비티에서는 화면 설계를 담고 있는 XML 파일의 아이디를 사용하여
     XML 파일을 찾아 빈화면에 UI를 추가한다.

[R 클래스]
=> 안드로이드에서는 앱에서 사용하는 모든 자원(이미지 파일, XML, 기타)에 대해
   아이디를 부여하고, 해당 아이디로 자원을 찾아 사용한다.
   물론 assets/ 폴더에 파일을 두는 경우에는 아이디를 부여하지 않고
   직접 사용한다.
=> R 클래스는 자원에 대해 안드로이드 앱이 부여한 아이디 값을 저장하고 있는 클래스이다.
=> 앱을 빌드할 때 자동으로 생성된다. 따라서 개발자가 직접 변경해서는 안된다.
=> 아이디 이름은 보통 파일명을 참고하여 짓는다.
   그래서 자원 파일을 만들 때는 반드시 파일명에 공백이 없어야 한다.

 */
package bitcamp.bigdata3.app01;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
}
