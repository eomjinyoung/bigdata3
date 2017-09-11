package bitcamp.bigdata3.app01;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    static final String TAG = MyFirebaseMessagingService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // FCM 서버가 앱으로 메시지를 보내면 이 메서드가 호출된다.
        Log.d(TAG, "FCM으로부터 받은 메시지: " + remoteMessage.getData());
    }
}
