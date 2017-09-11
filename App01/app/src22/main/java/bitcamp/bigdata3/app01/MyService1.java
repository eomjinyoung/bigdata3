package bitcamp.bigdata3.app01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService1 extends Service {
    static final String TAG = MyService1.class.getName();

    public MyService1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // 바인드된 서비스에서 호출된다.
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, ".onCreate()...");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, ".onStartCommand()...");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ".onDestroy()...");
    }
}
