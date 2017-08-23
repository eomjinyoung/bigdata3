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
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View tab1;
    View tab2;
    View tab3;

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
        setContentView(R.layout.activity_main2);

    }





}
