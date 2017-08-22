/* 레이아웃 다루기: ConstraintLayout
=> Android Studio 2.3.x부터 액티비티의 기본 레이아웃으로 채택되었다.
=> 뷰의 Anchor point(뷰의 연결점; 동서남북 테두리에 있는 점)를
   부모나 다른 동료 뷰에 연결하여 자신의 위치를 설정하는 방법

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) layout_width, layout_height
        //   => match_parent : 부모의 크기에 자신을 맞춘다.
        //setContentView(R.layout.activity_main1);

        //   => wrap_content : 내용물의 크기에 자신을 맞춘다.
        //setContentView(R.layout.activity_main2);

        //   => XXdp : 뷰의 크기를 지정한다.
        // dp or dip(density independent pixel) :
        //   - 논리적인 픽셀 지정
        //   - 보통 물리적인 픽셀 4개를 묶어 한 개의 논리 픽셀로 사용한다.
        // sp or sip (scale independent pixel)
        //   - 폰트의 확장 크기를 기준으로 한 논리 픽셀
        //   - 폰트 크기를 지정할 때 주로 사용. dp를 대신 사용할 수 있다.
        // px(pixel), in(inch), mm(밀리미터) 등
        //setContentView(R.layout.activity_main3);

        // 2) 네임스페이스
        // => android:xxx  - 안드로이드 SDK에 기본으로 포함된 것.
        // => app:xxx      - 외부 라이브러리에 포함된 것.
        // => tools:xxx    - 안드로이드 스튜디오에서 사용하는 것.
        //                   실제 앱에 적용되지 않는다.
        //                   즉 개발하는 동안에만 도움을 줄 목적으로 사용한다.
        // => main4 레이아웃의 버튼에는 절대 좌표가 설정되어 있다.
        //    단 안드로이드 스튜디어에서 디자인 하는 동안에 사용할 좌표 값이다.
        //    앱을 실제 실행할 때는 무시된다.
        // => ConstraintLayout에서 뷰를 배치하려면
        //    적절한 제약조건을 설정해야 한다.
        //    설정하지 않으면 main4와 같이 버튼을 왼쪽 상단을 기준으로 배치한다.
        //setContentView(R.layout.activity_main4);

        // 3) 부모를 기준으로 배치
        // => anchor point를 부모의 왼쪽,오른쪽,상단,하단에 연결하여 맞춘다.
        //setContentView(R.layout.activity_main5);

        // 4) Vertical Bias, Horizontal Bias
        // => 가운데 정렬시킬 때 좌우, 위아래의 비율을 지정할 수 있다.
        //setContentView(R.layout.activity_main6);

        // 5) 동료 뷰를 기준으로 배치할 수 있다.
        //setContentView(R.layout.activity_main7);

        // 6) Guideline 사용하기
        // 테두리 바깥 여백:layout_margin, layout_marginLeft, ...Right, ...Top, ...Bottom
        // 테두리 안쪽 여백:padding, paddingLeft, ...Right, ...Top, ...Bottom
        //setContentView(R.layout.activity_main8);

        // 7) 로그인 화면 만들기
        setContentView(R.layout.activity_main9);
    }


}
