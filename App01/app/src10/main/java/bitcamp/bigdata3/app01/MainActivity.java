/* 레이아웃 다루기: RelativeLayout
=> 부모 또는 다른 뷰 객체를 기준으로 특정 뷰의 위치를 지정한다.
=> 부모기준
   layout_alignParentLeft, ...Right, ...Top, ...Bottom,
   layout_centerHorizontal, ...Vertical, ...InParent
=> 다른 뷰 기준
   layout_above, layout_below, ...toLeftOf, ...toRightOf,

 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) 부모를 기준으로 정렬하기
        // => layout_alignParentLeft, ...Right, ...Top, ...Bottom
        // => layout_centerHorizontal(수평 중앙), ...Vertical(수직 중앙)
        //    ...InParent(정가운데)
        // => 정렬한 후 margin 값을 통해 위치를 조정한다.
        //setContentView(R.layout.activity_main1);


        //2) layout_alignParentStart/...End
        // => layout_alignParentLeft/...Right 와 같다.
        //setContentView(R.layout.activity_main2);

        //3) 다른 뷰를 기준으로 정렬하기
        // => layout_alignLeft="기준뷰" : 기준이 되는 뷰의 왼쪽면에 맞추어 정렬한다.
        //    ...Right, ...Top, ...Bottom 도 마찬가지로 기준이 되는 뷰의 해당 면에 맞추어 정렬한다.
        // => layout_toRightOf="기준뷰" : 기준이 되는 뷰의 오른쪽에 위치시킨다.
        //    ...toLeftOf(왼쪽에 위치시킨다),
        //    layout_above(위쪽), layout_below(아래쪽)
        //setContentView(R.layout.activity_main3);

        //4) 로그인 화면을 만들라!
        // => RelativeLayout 만 사용하여 만들라!
        setContentView(R.layout.activity_main4);

    }





}
