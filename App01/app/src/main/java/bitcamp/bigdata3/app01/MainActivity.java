/* 레이아웃 다루기: FrameLayout
=> UI 객체를 겹쳐서 관리한다.
=> visibility 속성을 사용하여 UI 출력 여부를 설정한다.

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

        //1) 버튼을 출력할 LinearLayout과 내용을 출력할 FrameLayout을 출력한다.
        //setContentView(R.layout.activity_main1);

        //2) LinearLayout에 버튼을 3개 추가한다.
        //   => 각 버튼에 대해 이벤트 리스너(핸들러)를 등록한다.
        //setContentView(R.layout.activity_main2);

        //3) 각 버튼에 해당하는 화면을 만들어 FrameaLayout에 추가한다.
        // => 버튼을 눌렀을 때 지정된 UI가 보이도록 한다.
        // => 다른 UI는 감춘다.
        setContentView(R.layout.activity_main3);

        // tab1, tab2, tab3 UI 객체를 찾아서 인스턴스 필드에 보관해 두었다가
        // 필요할 때 참조한다.
        tab1 = this.findViewById(R.id.tab1);
        tab2 = this.findViewById(R.id.tab2);
        tab3 = this.findViewById(R.id.tab3);

    }

    public void onButton1Click(View v) {
        //Toast.makeText(this,"버튼1 눌렀음!", Toast.LENGTH_SHORT).show();
        tab1.setVisibility(View.VISIBLE);
        tab2.setVisibility(View.INVISIBLE);
        tab3.setVisibility(View.INVISIBLE);
    }

    public void onButton2Click(View v) {
        //Toast.makeText(this,"버튼2 눌렀음!", Toast.LENGTH_SHORT).show();
        tab1.setVisibility(View.INVISIBLE);
        tab2.setVisibility(View.VISIBLE);
        tab3.setVisibility(View.INVISIBLE);
    }

    public void onButton3Click(View v) {
        //Toast.makeText(this,"버튼3 눌렀음!", Toast.LENGTH_SHORT).show();
        tab1.setVisibility(View.INVISIBLE);
        tab2.setVisibility(View.INVISIBLE);
        tab3.setVisibility(View.VISIBLE);
    }



}
