/* 스레드에서 UI 다루기 III - AsyncTask 객체를 활용하는 방법
=> AsyncTask를 상속 받아 작업 코드와 UI 제어 코드를 함께 둔다.
=> 별도의 스레드로 작업해야 하는 경우
   1) AsyncTask.execute(아규먼트)를 호출한다.
   2) 별도의 스레드가 실행되어 AsyncTask.doInnBackground() 호출한다.
   3) 별도 스레드 작업 끝나면 main 스레드가 AsyncTask.onPostExecute() 호출한다.
 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainXActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main5");
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        this.startActivity(intent);

        //AsyncTask를 실행한다.
        //new EchoAsyncTask().execute(address, message);
    }


}
