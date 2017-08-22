package bitcamp.bigdata3.app01;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Button3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setBackgroundColor(Color.RED);

        // 1) UI를 설정한 XML 파일을 읽어 자바 객체로 만들어 줄 도구를 준비한다.
        // => 안드로이드 시스템에게 해당 서비스를 제공할 객체를 달라고 한다.
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        // 2) 인플레이터 객체를 이용하여 XML 파일에 설정된 대로 생성한 객체를 리턴 받는다.
        // => TextView 객체를 인플레이터를 이용하여 간접적으로 만든다.
        TextView tv = (TextView)inflater.inflate(R.layout.mytextview, null);

        layout.addView(tv);

        this.setContentView(layout);

    }
}
