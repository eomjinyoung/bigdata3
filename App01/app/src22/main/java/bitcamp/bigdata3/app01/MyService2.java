package bitcamp.bigdata3.app01;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service {
    static final String TAG = MyService2.class.getName();

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 서비스에서도 시간이 오래 걸리는 작업은 별도의 스레드에서 진행해야 한다.
        // main스레드에서 진행을 하면 사용자의 행위에 반응을 하지 못하는 문제가
        // 발생한다.
        new MyAsyncTask().execute();

        Log.d(TAG, "onStartCommand()");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    class MyAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            int count = 0;
            while (true) {
                Log.d(TAG, "========> " + count);
                if (((++count) % 10) == 0) { // 10초에 한 번씩 MainActivity를 띄운다.
                    break;
                }
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            // 자식 스레드의 작업이 끝나면,
            // main 스레드가 이 메서드를 호출한다.
            Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP |
                    Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(myIntent);

        }
    }
}
