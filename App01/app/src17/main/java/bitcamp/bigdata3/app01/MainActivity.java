/* 에코 클라이언트 만들기
1) 스레드를 사용해야 하는 이유
=> 네트워크 통신은 속도에 따라 실행이 지연되는 경우가 있다.
   그럴 경우 통신이 완료할 때까지 화면이 멈추거나
   사용자의 터치에 반응하지 않는 문제가 발생한다.
=> 그래서 안드로이드에서는 통신과 같이 UI 실행에 영향을 미치는 기능인 경우
   반드시 별도의 스레드를 띄워서 실행하도록 요구하고 있다.

2) 중요 자원의 이용 권한 획득
=> 인터넷과 같은 중요 자원을 이용하려면
   반드시 AndroidManifest.xml 파일에 권한 요청을 설정해야 한다.
 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        String address = ((EditText)this.findViewById(R.id.etAddress))
                                .getText()
                                .toString();
        String message = ((EditText)this.findViewById(R.id.etMessage))
                                .getText()
                                .toString();
        new EchoClient(address, message).start();
    }

    class EchoClient extends Thread {
        String address;
        String message;

        public EchoClient(String address, String message) {
            this.address = address;
            this.message = message;
        }

        @Override
        public void run() {
            Socket socket = null;
            try {
                socket = new Socket(this.address, 9999);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());

                out.writeUTF(this.message);
                String responseText = in.readUTF();
                Log.v(TAG, responseText);

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            } finally {
                try {socket.close();} catch (Exception e) {}
            }
        }
    }
}
