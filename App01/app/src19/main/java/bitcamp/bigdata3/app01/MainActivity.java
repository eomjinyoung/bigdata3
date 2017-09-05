/* ListView를 이용하여 강사 목록 출력하기
=> ListView에 출력할 UI와 데이터 클래스 추가
   1) Teacher : 강사 데이터를 저장할 클래스
   2) TeacherView : 강사 데이터를 출력할 ListView 항목
   3) view_teacher.xml : 강사 데이터를 실제 출력하는 UI 컴포넌트

 */
package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    public static final int REQ_LOGIN = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main5");
        setContentView(R.layout.activity_main1);
    }

    public void onButton1Click(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        this.startActivityForResult(intent, REQ_LOGIN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQ_LOGIN) {
            Member member = data.getExtras().getParcelable("member");
            Log.v(TAG, member.toString());

            Intent intent = new Intent(this, TeacherActivity.class);
            this.startActivity(intent);
        }
    }

    public void onButton2Click(View v) {
        Intent intent = new Intent(this, TeacherActivity.class);
        this.startActivity(intent);
    }
}
