/* 안드로이드 앱 빌드
1) 자바 컴파일
   .java ---> .class
2) Dalvik VM Excutable Format
   .class, .class, .class, ... ---> .dex
   => 자바 바이트코드를 Dalvik VM이 이해할 수 있는 형식으로 변환한다.
   => Dalvik?
      - Java VM의 안드로이드 버전
      - JVM은 라이센스 문제로 안드로이드 전용 VM을 만들게 되었다.
3) Android Application Package Kit
   .dex + AndroidManifest.xml + 기타 자원 ---> .apk
   => 안드로이드 앱 설치 파일
   => 플레이스토어나 USB를 통해 다운로드 받은 앱을 설치하면
      내부적으로 안드로이드 폰은 이 파일을 지정된 폴더에 압축을 풀어 설치한다.

[ART(Android Runtime)]
=> Dalvik VM의 한계 및 라이센스 문제를 해결하기 위해 만든 VM이다.
=> 안드로이드 5.0(Lolipop)에서 Dalvik을 대체하였다.

[JIT(Just-in-Time)]
=> 앱을 실행할 때 마다 바이트코드를 읽어서 처리한다면 매우느리다.
   이런 문제를 해결하기 위해 나온 것이 JIT 컴파일 기법이다.
=> 구동 원리
   1) 앱을 실행할 때 마다
   2) 일부의 바이트코드를 OS가 바로 인식할 수 있는 진짜 기계어로 변환한다.
   3) 기계어로 변환된 것을 실행할 때는 JVM 없이 직접 실행하기 때문에 속도가 빠르다.
=> 문제점
   - 앱을 실행할 때 마다 변환하기 때문에 CPU에 부하가 걸린다.
   - 실행 속도가 떨어진다.
   - 밧데리 소모된다.

[AOT(Ahead-of-Time)]
=> JIT의 문제를 해결하기 위해 등장한 방식
=> 구동원리
   1) 안드로이드 앱을 설치한다.
   2) 앱을 네이티브코드(OAT 포맷)로 변환한다.
=> 문제점
   - 앱을 설치하는 속도가 느리다.
   - 미리 모든 앱을 네이티브로 변환하기 때문에 저장 용량을 많이 사용한다.

[AOT + JIT]
=> 안드로이드 7.0 부터 AOT에 JIT 방식을 결합하여 설치할 때 속도가 느린 점을 개선하였다.
=> 구동원리
   1) 안드로이드 앱을 설치한다.
   2) 앱의 일부 코드를 네이티브 코드로 변환한다.
   3) 실행할 때 또 일부 코드를 네이티브로 변환한다.
   3) 그리고 핸드폰을 사용하지 않고 충전할 때 나머지 코드를 네이티브로 변환한다.
 */
package bitcamp.bigdata3.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
