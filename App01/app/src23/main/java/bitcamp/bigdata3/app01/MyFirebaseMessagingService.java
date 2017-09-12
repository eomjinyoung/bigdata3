package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    static final String TAG = MyFirebaseMessagingService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // FCM 서버가 앱으로 메시지를 보내면 이 메서드가 호출된다.
        Map<String,String> data = remoteMessage.getData();
        Log.d(TAG, "FCM으로부터 받은 메시지: " + data);

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP |
                        Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_NEW_TASK);
        if (data.get("name") != null) {
            intent.putExtra("name", data.get("name"));
            intent.putExtra("age", data.get("age"));
        }
        startActivity(intent);
    }
}
