package bitcamp.bigdata3.app01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class Button2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setBackgroundColor(Color.RED);

        Button btn1 = new Button(this);
        btn1.setText("버튼1");
        layout.addView(btn1);

        Button btn2 = new Button(this);
        btn2.setText("버튼2");
        layout.addView(btn2);

        Button btn3 = new Button(this);
        btn3.setText("버튼3");
        layout.addView(btn3);

        this.setContentView(layout);
    }
}
