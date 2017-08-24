package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Sub2 액티비티");
        setContentView(R.layout.activity_sub2);

        // 메인 액티비티가 보낸 데이터를 꺼낸다.
        // => 메인 액티비티가 보낸 인텐트 객체를 알아낸다.
        Intent intent = this.getIntent();

        // => 인텐트에 들어 있는 Bundle 바구니에서 값을 꺼낸다.
        String name = intent.getExtras().getString("name");
        int age = intent.getExtras().getInt("age");

        // 인텐트에서 꺼낸 값을 화면에 넣는다.
        // => EditText 객체를 알아낸다.
        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etAge = (EditText) findViewById(R.id.etAge);

        // => EditText 객체에 값을 설정한다.
        etName.setText(name);
        etAge.setText(Integer.toString(age));
    }

    public void onButton1Click(View v) {
        EditText etName = (EditText) this.findViewById(R.id.etName);
        EditText etAge = (EditText) this.findViewById(R.id.etAge);

        String name = etName.getText().toString();
        int age = Integer.parseInt(etAge.getText().toString());

        // 이 액티비티를 요청한 쪽에 값을 리턴할 때도 Intent 객체에 담아서 리턴한다.
        // 값을 리턴하는 경우에는 Intent 객체를 만들 때 기본 생성자로 만든다.
        Intent intent = new Intent();
        intent.putExtra("name", name);
        intent.putExtra("age", age);

        // 첫번째 파라미터(resultCode): RESULT_OK
        //   => 요청한 쪽에 결과를 정상적으로 리턴한다는 의미다.
        //   => 안드로이드 플랫폼은 이 경우 요청한 액티비티에 대해
        //      onActivityResult() 메서드를 호출한다.
        // 두번째 파라미터(Intent 객체)
        this.setResult(RESULT_OK, intent); // 인텐트를 요청 액티비티 쪽에 리턴한다.

        this.finish();
    }
}
