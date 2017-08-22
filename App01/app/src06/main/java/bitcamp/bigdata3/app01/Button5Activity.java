package bitcamp.bigdata3.app01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Button5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setBackgroundColor(Color.RED);

        TextView tv = new TextView(this);
        tv.setText("안녕하세요!");
        tv.setBackgroundColor(Color.BLUE);
        tv.setTextColor(Color.YELLOW);

        // 안타깝게도 뷰의 너비 높이를 설정할 때 다음과 같이
        // 메서드를 호출할 수 없다.
        //tv.setLayoutWidth(...);
        //tv.setLayoutHeight(...);

        // TextView를 LinearLayout에 넣을 때
        // 너비, 높이를 어떻게 설정할 것인지 지정한다.
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // 레이아웃 정보와 함께 UI 객체를 뷰그룹에 추가하는 방법
        // 방법1) 레이아웃 파라미터 정보를 UI 객체에 설정한 다음, 뷰그룹에 추가하기
        tv.setLayoutParams(params);
        layout.addView(tv);

        // 방법2) TextView를 뷰그룹에 넣을 때 배치 파라미터 값을 함께 지정한다.
        //layout.addView(tv, params);

        this.setContentView(layout);
    }
}
