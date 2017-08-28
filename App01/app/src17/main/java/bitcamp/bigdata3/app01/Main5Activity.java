/* 스레드에서 UI 다루기 III - AsyncTask 객체를 활용하는 방법
=> AsyncTask를 상속 받아 작업 코드와 UI 제어 코드를 함께 둔다.
=> 별도의 스레드로 작업해야 하는 경우
   1) AsyncTask.execute(아규먼트)를 호출한다.
   2) 별도의 스레드가 실행되어 AsyncTask.doInnBackground() 호출한다.
   3) 별도 스레드 작업 끝나면 main 스레드가 AsyncTask.onPostExecute() 호출한다.
 */
package bitcamp.bigdata3.app01;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Main5Activity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main5");
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        String address = ((EditText)this.findViewById(R.id.etAddress))
                                .getText()
                                .toString();
        String message = ((EditText)this.findViewById(R.id.etMessage))
                                .getText()
                                .toString();
        //AsyncTask를 실행한다.
        new EchoAsyncTask().execute(address, message);
    }

    // Async<아규먼트의 타입, 중간 상태 리턴 타입, 결과 리턴 타입>
    class EchoAsyncTask extends AsyncTask<String, Void, String> {
        // 작업 스레드에서 호출하는 메서드
        @Override
        protected String doInBackground(String... params) {
            Socket socket = null;
            try {
                socket = new Socket(params[0], 9999);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());

                out.writeUTF(params[1]);
                return in.readUTF(); // main 스레드에게 작업 결과를 리턴한다.

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            } finally {
                try {socket.close();} catch (Exception e) {}
            }
            return null;
        }

        // 작업 스레드가 작업을 완료한 후 main 스레드가 호출하는 메서드
        // => 작업 스레드가 doInBackground() 호출을 완료한 후에
        //    main 스레드가 호출하는 메서드
        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(Main5Activity.this,
                    result,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
