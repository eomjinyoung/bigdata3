package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.Toast;

import bitcamp.bigdata3.app01.util.RESTful;
import bitcamp.bigdata3.app01.util.Utils;

public class SpeakerActivity extends AppCompatActivity {
    static final String TAG = SpeakerActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker);

        //1) SeekBar 객체를 알아낸다.
        SeekBar seekBar = (SeekBar) this.findViewById(R.id.seekBar);

        //2) SeekBar에서 발생하는 이벤트를 처리하는 리스너를 추가한다.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.v(TAG, "onStopTrackingTouch(): " + seekBar.getProgress());
                new VolumeControlTask().execute(seekBar.getProgress());
            }

        });
    }

    class VolumeControlTask extends AsyncTask<Integer, Void, Void> {
        @Override
        protected Void doInBackground(Integer... params) {
            try {
                RESTful.get(String.format(
                        "http://192.168.0.6:8080/arduino/json/setVolume/%d", params[0]));

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
