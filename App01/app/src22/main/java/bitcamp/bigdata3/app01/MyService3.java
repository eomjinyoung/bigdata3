package bitcamp.bigdata3.app01;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService3 extends Service {
    static final String TAG = MyService3.class.getName();

    //=> 바깥의 다른 멤버와 연락을 취할 객체를 정의한다.
    //=> 규칙
    //   - IBinder 구현체이어야 한다.
    //   - 그러나 IBinder 인터페이스에 선언된 메서드가 매우 많기 때문에
    //     안드로이드에서는 개발자를 위해 이 인터페이스를 구현한 클래스를 제공한다.
    //     그 클래스를 상속 받아 만들라!
    class LocalBinder extends Binder {

        // 이 앱의 다른 멤버가 MyService3의 객체 주소를 달라고 요구하면 리턴해 준다.
        public MyService3 getService() {
            return MyService3.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, ".onBind()");
        // 이 메서드에서 서비스 객체가 백그라운드에서 해야할 작업을 한다.
        // => 보통 자식 스레드에게 작업을 맡긴다.

        // 다른 멤버가 이 서비스 객체와 연락을 취할 수 있도록
        // 연락 담당자를 리턴한다.
        return new LocalBinder();
    }

    public int getValue() {
        return 100;
    }
}
