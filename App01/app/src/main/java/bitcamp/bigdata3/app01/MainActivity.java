/* View와 ViewGroup
=> View 클래스?
   - 안드로이드 UI 객체를 위한 공통 필드와 메서드를 정의한 클래스이다.
   - 안드로이드의 모든 UI 객체는 이 클래스의 자손이다.
   - UI 중에서 버튼이나 텍스트 상자와 같이
     화면에 출력되는 View 객체를 "위젯(widget)"이라 부른다.
   - 예) TextView, EditView, Button, ImageView 등

=> ViewGroup 클래스?
   - ViewGroup도 View의 자손이다.
   - 단 다른 뷰를 담을 수 있는 기능을 갖고 있다.
   - 실제 뭔가를 출력하는 것이 아니라 자신이 품고 있는 뷰 객체의
     배치를 관리하는 일을 한다.
   - 예) ConstraintLayout, LinearLayout, GridLayout

=> 뷰 그룹을 중첩하여 원하는 UI를 만들 수 있다.

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
