/* 에코 클라이언트 만들기 II
1) 서버로부터 받은 메시지를 토스트로 출력하기
   => 액티비티에서 만든 다른 스레드는 UI를 사용할 수 없다.

[안드로이드에서 UI를 제어하기]
=> 안드로이드는 기본적으로 main 스레드가 UI를 다룬다.
=> 그외 모든 스레드는 UI를 다룰 수 없다.
=> 이유?
   - 액티비티가 존재하지 않는 상태에서 임의의 스레드가
     존재하지 않는 액티비트의 UI를 사용하는 상황을 방지하기 위함이다.
   - 그래서 안드로이드에서는 main 스레드만이 액티비트의 UI를 제어할 수 있다.
=> 그럼 다른 스레드에서 UI를 다루기 위해서는?
   - main 스레드에게 요청하라!
 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Main2Activity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main2");
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

                // main 이 아닌 스레드에서는
                // 다음과 같이 UI를 다룰 수 없다.
                Toast.makeText(Main2Activity.this, responseText, Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            } finally {
                try {socket.close();} catch (Exception e) {}
            }
        }
    }
}
