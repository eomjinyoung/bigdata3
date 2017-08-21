package bitcamp.bigdata3.app01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Button1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1) 액티비티에 출력할 UI 컴포넌트를 만든다.
        // => 안드로이드에서 제공해주는 View 클래스(하위 클래스 포함)를 사용하여 만든다.
        // => 화면에 출력할 객체를 만들고, 속성을 설정한 후
        //    액티비티의 메인 UI(콘텐츠 뷰)로 설정한다.
        TextView tv = new TextView(this.getApplicationContext());
        tv.setText("안녕하세요!");
        tv.setBackgroundColor(Color.YELLOW);

        // 2) 액티비트의 메인 UI를 TextView 객체로 설정한다.
        this.setContentView(tv);
    }
}
