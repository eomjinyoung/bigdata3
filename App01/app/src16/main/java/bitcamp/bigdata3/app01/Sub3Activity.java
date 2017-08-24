package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Sub3Activity extends AppCompatActivity {
    public static final String TAG = Sub3Activity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        Intent intent = this.getIntent();
        Member member = intent.getExtras().getParcelable("member");
        Log.v(TAG, member.toString());
    }

    public void onButton1Click(View v) {
        this.finish();
    }
}
