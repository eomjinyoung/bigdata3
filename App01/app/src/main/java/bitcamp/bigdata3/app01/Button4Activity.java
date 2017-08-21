package bitcamp.bigdata3.app01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Button4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setBackgroundColor(Color.RED);

        // 1) View 클래스에 있는 인플레이터를 이용해도 된다.
        TextView tv = (TextView) View.inflate(this, R.layout.mytextview, null);

        layout.addView(tv);

        this.setContentView(layout);
    }
}
