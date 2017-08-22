package bitcamp.bigdata3.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Button6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView() 메서드에 레이아웃 XML 파일의 아이디를 주면
        // 해당 XML을 찾아 그 내용에 따라 UI 객체를 준비한 후
        // 액티비트 화면에 더한다.
        this.setContentView(R.layout.activity_sub);
    }
}
