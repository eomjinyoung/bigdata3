/* FCM 사용하기
1) firebase 서버 쪽에 알림 메시지를 처리할 프로젝트를 생성한다.
   - firebase.google.com 에서 프로젝트를 만들라!
   - 프로젝트명을 기준으로 자동으로 프로젝트 ID를 지정하는데,
     만약 기존에 같은 이름의 ID가 있다면 "프로젝트명-임의값" 형식으로 ID가 주어질 것이다.
2) Android 앱을 위한 프로젝트 설정
   - 안드로이드 패키지명은 앱의 패키지명과 일치하게 한다.
     예) bitcamp.bigtdata3.app01

   - "google-services.json" 파일을 다운로드 받아
     안드로이드프로젝트폴더/app/google-services.json

   - 안드로이드프로젝트폴더/build.gradle 파일에 클래스 경로 추가
     예)
buildscript {
  dependencies {
    // Add this line
    classpath 'com.google.gms:google-services:3.1.0'
  }
}

   - 안드로이드프로젝트폴더/app/build.gradle 파일에 Gradle 플러그인 추가
     예)
// build.gradle 파일의 맨 아래에 다음을 추가한다.
apply plugin: 'com.google.gms.google-services'

   - 안드로이드프로젝트폴더/app/build.gradle 파일에 FCM 의존 라이브러리 추가
     예) compile 'com.google.firebase:firebase-messaging:10.2.6'

   - AndroidManifest.xml 파일에 FCM 서버와 연동할 서비스들을 등록한다.
     예)
// FCM 서버에서 메시지를 받아 처리할 서비스 객체
<service
    android:name=".MyFirebaseMessagingService">
    <intent-filter>
        <action android:name="com.google.firebase.MESSAGING_EVENT"/>
    </intent-filter>
</service>

// FCM 서버에서 발급하는 토큰을 관리할 서비스 객체
<service
    android:name=".MyFirebaseInstanceIDService">
    <intent-filter>
        <action android:name="com.google.firebase.INSTANCE_ID_EVENT"/>
    </intent-filter>
</service>

   - 서비스 객체가 인터넷을 사용해야 하기 때문에 AndroidManifest.xml 파일에 권한 설정.
     예)
<uses-permission android:name="android.permission.INTERNET" />

3) FCM 서버가 보낸 메시지를 처리할 클래스 작성하기
public class MyFirebaseMessagingService extends FirebaseMessagingService {...}

4) FCM 서버가 발급한 토큰을 관리할 클래스 작성하기
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {...}

5) 발급 받은 토큰 값
   예)
dQ_NnNUrFww:APA91bGke4M87MneVw0ckgwabDMH8zfgQnvHthX_DdZKEZJS0vMQh67eZGuMc-pDpEAJCL1uQyP-WBO7UqwuXkTtO7Kb9O_HQG2Bz2btau0vTWRL1dQvQLaDurR8PgfQECuTzLV-iu5-

알림 메시지 와 데이터 페이로드
1) FCM 서버에서 알림 메시지를 보낼 경우
   => 액티비티가 실행 중일 때 : FirebaseMessagingService가 실행된다.
   => 액티비티가 빌활성일 때 : 핸드폰의 알림으로 처리된다.
2) FCM 서버에서 데이터 페이로드를 보낼 경우
   => 무조건 FirebaseMessagingService가 실행된다.
3) FCM 서버에서 알림메시지와 데이터 페이로드를 함께 보낼 경우,
   => 액티비티가 실행 중일 때 : FirebaseMessagingService가 실행된다.
   => 액티비티가 빌활성일 때 : 핸드폰의 알림으로 처리된다.
 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Log.d(TAG, ".onCreate()");

        // 화면이 없는 서비스에서 액티비티를 실행할 때 Intent로 넘긴 값을 받기
        // 1) 새로 액티비티를 띄웠을 때,
        //    => onCreate()에서 받는다.
        // 2) 기존에 있는 액티비티를 실행할 때,
        //    => onNewIntent()에서 받는다.
        // 두 가지 경우를 모두 고려하라!

        Intent intent = getIntent();
        processData(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        // 서비스에서 존재하는 액티비티에 대해 Intent를 넘길 때
        // 이 메서드를 오버라이딩하여 intent 데이터를 처리해야 한다.
        super.onNewIntent(intent);
        processData(intent);
    }

    protected void processData(Intent intent) {
        Log.d(TAG, ".processData()");

        if (intent.getStringExtra("name") != null) {
            // 인텐트 상자에서 저장된 name, age 값을 꺼내 토스트로 출력한다.
            Toast.makeText(getApplicationContext(),
                    "name=" + intent.getExtras().get("name") +
                            ", age=" + intent.getExtras().get("age"),
                    Toast.LENGTH_LONG).show();
        }
    }


}
