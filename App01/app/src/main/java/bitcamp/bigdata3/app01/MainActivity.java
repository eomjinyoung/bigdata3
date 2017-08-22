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
        setContentView(R.layout.activity_main1);

    }


}
