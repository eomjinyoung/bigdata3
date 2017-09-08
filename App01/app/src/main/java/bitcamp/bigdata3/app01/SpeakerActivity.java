package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import org.json.JSONObject;

import bitcamp.bigdata3.app01.util.RESTful;
import bitcamp.bigdata3.app01.util.Utils;

public class SpeakerActivity extends AppCompatActivity {
    static final String TAG = SpeakerActivity.class.getName();
    static final String REST_GET_URL =
            "http://192.168.0.6:8080/arduino2/json/get/192.168.0.6/";
    static final String REST_SET_URL =
            "http://192.168.0.6:8080/arduino2/json/set/192.168.0.6/";

    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker);

        //1) SeekBar 객체를 알아낸다.
        seekBar = (SeekBar) this.findViewById(R.id.seekBar);

        //2) SeekBar에서 발생하는 이벤트를 처리하는 리스너를 추가한다.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.v(TAG, "onStopTrackingTouch(): " + seekBar.getProgress());
                new VolumeSizeTask().execute(seekBar.getProgress());
            }

        });

        // RadioButton의 상태가 변경되는 이벤트가 발생했을 때 처리할 객체 등록
        RadioGroup radioGroup = (RadioGroup) this.findViewById(R.id.group1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.rbHardware) {
                    new VolumeControlTask().execute("hardware");
                    Log.v(TAG, "hardware");
                } else {
                    new VolumeControlTask().execute("software");
                    Log.v(TAG, "software");
                }
            }
        });
    }

    public void onButton1Click(View v) {
        new VolumeReadTask().execute();
    }

    class VolumeSizeTask extends AsyncTask<Integer, Void, Void> {
        @Override
        protected Void doInBackground(Integer... params) {
            try {
                RESTful.get(REST_SET_URL + "volume/" + params[0]);
                Log.v(TAG, "서버 요청: volume/" + params[0]);

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
            }
            return null;
        }
    }

    class VolumeReadTask extends AsyncTask<Void, Void, Integer> {
        @Override
        protected Integer doInBackground(Void... params) {
            try {
                JSONObject result = RESTful.getJSON(REST_GET_URL + "volume");

                return result.getInt("data");

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer result) {
            SpeakerActivity.this.seekBar.setProgress(result);
        }
    }

    class VolumeControlTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... params) {
            try {
                JSONObject result = RESTful.getJSON(REST_SET_URL + "volume_control/" + params[0]);
                Log.v(TAG, "서버 요청: volume_control/" + params[0]);

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
            }
            return null;
        }
    }
}
