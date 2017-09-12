package bitcamp.bigdata3.app01;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    static final String TAG = MyFirebaseInstanceIDService.class.getName();
    @Override
    public void onTokenRefresh() {
        // FCM 서버에서 발급한 토큰을 받으면 이 메서드가 호출된다.

        // 이 메서드가 호출되면, 개발자가 할 일은
        // 발급 받은 토큰 값을 알아내어 메시지를 보낼 당사자에게 전달한다.
        // 즉 나한테 메시지를 보내려면 상대편이 내 전화번호를 알아야 할 것 아닌가!
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "FCM 서버에서 받은 토큰 값: " + refreshedToken);
    }
}
