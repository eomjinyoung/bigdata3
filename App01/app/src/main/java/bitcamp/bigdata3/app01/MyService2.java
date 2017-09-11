package bitcamp.bigdata3.app01;

import android.app.Service;
import android.content.Intent;
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
        try {
            for (int i = 0; i < 10; i++) {
                Log.d(TAG, "========> " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {}

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP |
                          Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(myIntent);

        return super.onStartCommand(intent, flags, startId);
    }
}
