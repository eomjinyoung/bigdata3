package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SubActivity extends AppCompatActivity {
    static final String TAG = SubActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.d(TAG, "SubActivity.onStart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SubActivity.onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SubActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SubActivity.onDestroy()");
    }


    public void onButton1Click(View v) {
        this.finish();
    }
}
