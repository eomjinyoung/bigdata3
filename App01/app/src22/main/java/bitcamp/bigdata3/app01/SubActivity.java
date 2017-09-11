package bitcamp.bigdata3.app01;

import android.content.Intent;
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

        Log.d(TAG, ".onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ".onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, ".onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ".onDestroy()");
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        // SubActivity 아래에 MainActivity가 깔려 있어도
        // 무조건 새로 MainActivity를 실행한다.
        startActivity(intent);
    }

    public void onButton2Click(View v) {
        this.finish();
    }

    public void onButton3Click(View v) {
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }

    public void onButton4Click(View v) {
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void onButton5Click(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // 새로 MainActivity를 실행하지 않고
        // 기존에 깔려있는 액티비트를 맨 위로 올린다.
        startActivity(intent);
    }



}
