package bitcamp.bigdata3.app01;

import android.content.Context;
import android.content.SharedPreferences;
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

        // => 앱 전용 프로퍼티 값을 저장할 수 있는 보관소 준비하기
        // getSharedPreferences() : 앱의 모든 멤버가 사용할 수 있다.
        // getPreferences() : 앱의 특정 액티비티만 사용할 수 있다.
        SharedPreferences sharedPref = this.getSharedPreferences(
            getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        // => 보관소에 데이터를 저장하는 것을 도와줄 편집기를 준비한다.
        SharedPreferences.Editor editor = sharedPref.edit();

        // => 편집기를 사용하여 값을 저장/변경한다.
        editor.putString(getString(R.string.fcm_token), refreshedToken);

        // => 편집기에서 작업한 것을 보관소에 저장한다.
        editor.commit();


    }
}
