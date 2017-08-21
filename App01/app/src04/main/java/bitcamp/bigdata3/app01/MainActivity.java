/* Intent를 이용하여 다른 앱을 실행하기
=> Intent를 사용하여 안드로이드에게 명령을 전달할 수 있다.
   예) 전화걸기 앱을 실행시켜라!
   예) 웹브라우저를 띄워라!
   예) 다른 액티비트를 실행하라!
=> 안드로이드는 앱이 제출한 Intent를 검토하여
   그에 맞는 가장 적절한 실행을 수행한다.

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Toast msgBox = Toast.makeText(
                this.getApplicationContext(), "눌렀음!", Toast.LENGTH_LONG);
        msgBox.show();
    }

    public void onButton2Click(View view) {
        Intent myIntent = new Intent(
                Intent.ACTION_VIEW, Uri.parse("http://www.daum.net"));
        this.startActivity(myIntent);
    }

    public void onButton3Click(View view) {
        Intent myIntent = new Intent(
                Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
        this.startActivity(myIntent);
    }

    public void onButton4Click(View view) {
        Intent myIntent = new Intent(this.getApplicationContext(), SubActivity.class);
        this.startActivity(myIntent);
    }
}
