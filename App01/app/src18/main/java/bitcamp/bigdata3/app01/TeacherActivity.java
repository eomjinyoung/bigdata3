package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void onButton1Click(View v) {
        this.finish();
    }
}
