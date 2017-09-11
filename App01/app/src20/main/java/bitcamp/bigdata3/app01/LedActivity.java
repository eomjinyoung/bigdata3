package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import bitcamp.bigdata3.app01.util.RESTful;
import bitcamp.bigdata3.app01.util.Utils;

public class LedActivity extends AppCompatActivity {
    public static final String TAG = LedActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
    }

    public void onButton1Click(View v) {
        Log.v(TAG, "on 버튼 클릭");
        new LedControlTask().execute("on");
    }

    public void onButton2Click(View v) {
        Log.v(TAG, "off 버튼 클릭");
        new LedControlTask().execute("off");
    }

    class LedControlTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... params) {
            try {
                RESTful.get(String.format(
                    "http://192.168.0.6:8080/arduino/json/setLED/%s", params[0]));

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            Toast.makeText(getApplicationContext(),
                    "서버 요청 완료!", Toast.LENGTH_SHORT).show();
        }
    }
}
