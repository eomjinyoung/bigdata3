/* 스레드에서 UI 다루기 I - main 스레드의 UI 핸들러에게 메시지를 보내기
=> main 스레드에 메시지 수신기(Handler)를 장착한다.
=> main 스레드에게 메시지를 보내는 절차
   1) 핸들러로부터 메시지 상자를 얻는다. => Handler.obtainMessage()
   2) 메시지 상자에 값을 저장한다.  => Message.put(key, value)
   3) 메시지를 핸들러에게 보낸다. => Handler.sendMessage()
 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Main3Activity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main3");
        setContentView(R.layout.activity_main1);

        // Handler 객체는 그 객체를 만드는 스레드에 장착된다.
        // 즉 다음 코드는 onCreate()에서 Handler 객체를 생성하기 때문에
        // 이 핸들러 객체는 main 스레드에 장착된다.
        // 왜? onCreate()를 호출하는 것은 main 스레드이기 때문이다.
        handler = new Handler() {
            // 다른 스레드로부터 메시지를 수신할 때마다
            // main 스레드는 다음 메서드를 호출한다.
            @Override
            public void handleMessage(Message msg) {
                String responseText = msg.getData().getString("responseText");
                Toast.makeText(Main3Activity.this,
                        responseText,
                        Toast.LENGTH_SHORT).show();
            }
        };
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

                // main 스레드에 데이터를 보내기 위해 상자를 준비한다.
                Bundle box = new Bundle();
                box.putString("responseText", responseText);

                // main 스레드에 메시지를 보내기
                // => 메시지 상자를 얻는다.
                Message cart = Main3Activity.this.handler.obtainMessage();

                // => 메시지 상자에 데이터가 보관된 박스를 담는다.
                cart.setData(box);

                // => main 스레드에 장착된 핸들러에게 메시지를 보낸다.
                Main3Activity.this.handler.sendMessage(cart);

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            } finally {
                try {socket.close();} catch (Exception e) {}
            }
        }
    }
}
