/* 스레드에서 UI 다루기 II - main 스레드의 UI 핸들러에게 Runnable을 보내기
=> main 스레드에 메시지 수신기(Handler)를 장착한다.
=> main 스레드에게 메시지를 보내는 절차
   1) UI를 다루는 Runnable 구현체를 만든다.
   2) 그 구현체를 main 스레드의 핸들러에게 보낸다. Handler.post()
 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Main4Activity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main4");
        setContentView(R.layout.activity_main1);

        // UI를 다루는 코드는 Runnable 구현체에 둔다.
        // 물론 실행은 main 스레드의 Handler에서 실행할 것이다.
        handler = new Handler();
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
                final String responseText = in.readUTF();
                Log.v(TAG, responseText);

                // main 스레드의 핸들러에게
                // UI를 다루는 코드가 들어 있는 Runnable 구현체를
                // 실행시켜 달라고 전달한다.
                Main4Activity.this.handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(Main4Activity.this,
                                responseText,
                                Toast.LENGTH_SHORT).show();
                    }
                });

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            } finally {
                try {socket.close();} catch (Exception e) {}
            }
        }
    }
}
