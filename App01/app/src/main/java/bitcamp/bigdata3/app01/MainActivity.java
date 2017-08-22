/* 레이아웃 다루기: LinearLayout
=> UI 객체를 수평 또는 수직으로 배치하는 레이아웃 관리자.
=> layout_gravity
   - 뷰 객체를 뷰그룹에 정렬하는 속성
   gravity
   - 뷰 객체의 내용물을 정렬하는 속성

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) 수평으로 정렬하여 배치하기
        //   => orientation=horizontal
        //setContentView(R.layout.activity_main1);

        //2) 수직으로 정렬하여 배치하기
        //   => orientation=vertical
        //setContentView(R.layout.activity_main2);

        //3) 수직으로 정렬하여 배치할 때 윈도우 크기를 벗어난다면?
        //   => 짤린다.
        //setContentView(R.layout.activity_main3);

        //4) 뷰의 위치를 조정하기(수평 배치)
        //   => layout_gravity : 뷰그룹에서 뷰의 위치를 조정할 때 사용한다.
        //setContentView(R.layout.activity_main4);

        //5) 뷰의 위치를 조정하기(수직 배치)
        //   => layout_gravity : 뷰그룹에서 뷰의 위치를 조정할 때 사용한다.
        //setContentView(R.layout.activity_main5);

        //6) 뷰의 내용물을 정렬하기
        //   => gravity : 뷰 안에 있는 내용물을 정렬할 때 사용한다.
        //setContentView(R.layout.activity_main6);

        //7) 뷰의 기본 크기에서 추가로 차지할 영역의 비율을 조정하기
        //   => layout_weight : 모든 뷰의 비중을 합쳐서 자신의 비중과 대비하여
        //                      너비나 높이를 결정한다.
        //setContentView(R.layout.activity_main7);

        //8) TextView 정렬
        //   => 기본으로 baseline을 기준으로 정렬한다.
        //   => 변경하고 싶다면, baselineAligned 값을 false로 설정하라!
        //setContentView(R.layout.activity_main8);

        //9) 로그인 화면을 만들라!
        //   => LinearLayout 만 사용하여 화면을 구성하라!
        setContentView(R.layout.activity_main9);
    }


}
