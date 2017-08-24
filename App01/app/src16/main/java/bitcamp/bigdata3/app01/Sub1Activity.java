package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Sub1Activity extends AppCompatActivity {
    public static final String TAG = Sub1Activity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Sub1 액티비티");
        setContentView(R.layout.activity_sub1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        Log.v(TAG, String.format("name=%s", bundle.getString("name")));
        Log.v(TAG, String.format("age=%d", bundle.getInt("age")));

    }

    public void onButton1Click(View v) {
        this.finish();
    }
}
