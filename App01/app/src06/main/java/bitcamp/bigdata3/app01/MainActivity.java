/* UI를 생성하는 다양한 방법
=> 자바 코드로 직접 생성
=> XML을 인플레이션 하여 UI 객체 생성
=> XML 레이아웃을 지정하여 간접적으로 생성


 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Click(View v) {
        // TextView 위젯을 자바 코드로 만들어 붙이기
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button1Activity.class);
        this.startActivity(myIntent);
    }

    public void onButton2Click(View v) {
        // 레이아웃을 포함한 위젯을 자바 코드로 만들어 붙이기
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button2Activity.class);
        this.startActivity(myIntent);
    }

    public void onButton3Click(View v) {
        // 자바코드 + XML = UI 만들기
        // 레이아웃은 자바 코드로 만들고,
        // TextView는 XML로 설계한다.
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button3Activity.class);
        this.startActivity(myIntent);
    }

    public void onButton4Click(View v) {
        // 자바코드 + XML = UI 만들기 II
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button4Activity.class);
        this.startActivity(myIntent);
    }

    public void onButton5Click(View v) {
        // 자바코드 + 레이아웃 파라미터 = UI 만들기
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button5Activity.class);
        this.startActivity(myIntent);
    }

    public void onButton6Click(View v) {
        // XML 레이아웃으로만 UI 만들기
        Intent myIntent = new Intent(
                this.getApplicationContext(), Button6Activity.class);
        this.startActivity(myIntent);
    }

}
