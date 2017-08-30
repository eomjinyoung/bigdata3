package bitcamp.bigdata3.app01;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherActivity extends AppCompatActivity {

    public static final String TAG = TeacherActivity.class.getName();

    ListView listView;
    TeacherAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        // => ListView 객체를 알아낸다.
        this.listView = (ListView) this.findViewById(R.id.list);

        // => ListView 객체에 데이터와 그 데이터를 출력하는 뷰 공급자를 만든다.
        this.listAdapter = new TeacherAdapter();
        this.listAdapter.addItem(new Teacher(100, "홍길동", "hong@test.com", null));
        this.listAdapter.addItem(new Teacher(101, "홍길동2", "hong2@test.com", null));
        this.listAdapter.addItem(new Teacher(102, "홍길동3", "hong3@test.com", null));
        this.listAdapter.addItem(new Teacher(103, "홍길동4", "hong4@test.com", null));
        this.listAdapter.addItem(new Teacher(104, "홍길동5", "hong5@test.com", null));

        // => ListView에 데이터 및 뷰 공급자를 설정한다.
        this.listView.setAdapter(listAdapter);

    }

    public void onButton1Click(View v) {
        this.finish();
    }

    class TeacherAdapter extends BaseAdapter {
        ArrayList<Teacher> items = new ArrayList<>();

        public void addItem(Teacher teacher) {
            items.add(teacher);
        }

        @Override
        public int getCount() {
            // 몇 개의 항목을 출력해야 하는지 알기 위해 ListView가 호출한다.
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            // 특정 항목의 데이터를 알고 싶을 때 호출한다.
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            // 특정 항목의 데이터를 구분하기 위한 키가 필요할 때 호출한다.
            // List에서 특정 항목을 선택했을 때 해당 항목의 ID를 알아내어
            // 서버에 상세 정보를 요청할 때 사용한다.
            return items.get(position).getNo();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // 지정된 인덱스에 출력할 항목을 만들 때 출력한다.
            TeacherView itemView = new TeacherView(getApplicationContext());
            itemView.setTeacher(items.get(position));
            return itemView;
        }
    }

    class TeacherListTask extends AsyncTask<Integer, Void, String> {
        @Override
        protected String doInBackground(Integer... params) {
            try {
                URL url = new URL(String.format(
                        "http://192.168.0.6:8080/teacher/json/list?pageNo=%d&pageSize=%d",
                        params[0], params[1]));
                URLConnection urlConnection = url.openConnection();

                Scanner in = new Scanner(urlConnection.getInputStream());
                StringBuffer buf = new StringBuffer();
                while (in.hasNext()) {
                    buf.append(in.nextLine());
                }
                return buf.toString();

            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }

            return null;
        }

        @Override
        protected void onPostExecute(String json) {
            try {
                if (json == null)
                    throw new Exception("서버 요청 오류!");

                JSONObject jsonObject = new JSONObject(json); // 문자열 ==> 자바 객체

                // 요청 실패 => 안내 문구를 띄운다.
                if (jsonObject.getString("state").equals("fail")) {
                    Toast.makeText(getApplicationContext(),
                            "강사 목록을 가져오는데 실패했습니다.",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // 성공 => 서버에서 받은 json 데이터를 JSONArray 객체에 담는다.
                JSONArray data = jsonObject.getJSONArray("data");

                // JSONArray에서 한 개의 JSONObject를 꺼낸다.
                // JSONObject에 있는 데이터를 Teacher 객체에 옮긴다.
                // Teacher 객체를 teacherList에 보관한다.
                ArrayList<Teacher> teacherList = new ArrayList<>();

                for (int i = 0; i < data.length(); i++) {
                    JSONObject obj = data.getJSONObject(i);



                    teacherList.add(teacher);
                }
                member.setPhotoList(photoList);

                // 다시 Member 객체를 Intent에 담는다.
                Intent intent = new Intent();
                intent.putExtra("member", member);

                // Intent 객체를 LoginActivity를 실행한 "MainActivity"에게 리턴한다.
                LoginActivity.this.setResult(RESULT_OK, intent);

            } catch (Exception e) {
                Toast.makeText(LoginActivity.this,
                        "로그인 오류!", Toast.LENGTH_LONG).show();

                // 어떤 오류인지 자세한 내용은 로그로 출력한다.
                StringWriter out = new StringWriter();
                e.printStackTrace(new PrintWriter(out));
                Log.e(TAG, out.toString());
            }
            LoginActivity.this.finish();

        }
    }

}
