package bitcamp.bigdata3.app01;

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

import java.util.ArrayList;

import bitcamp.bigdata3.app01.util.RESTful;
import bitcamp.bigdata3.app01.util.Utils;

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

        // => ListView에 데이터 및 뷰 공급자를 설정한다.
        this.listView.setAdapter(listAdapter);

        // => 서버에서 강사 데이터 목록을 가져온다.
        new TeacherListTask().execute(1, 7);
    }

    public void onButton1Click(View v) {
        this.finish();
    }

    class TeacherAdapter extends BaseAdapter {
        ArrayList<Teacher> items = new ArrayList<>();

        public void reset() {
            items.clear(); // ArrayList 객체에 저장된 것들을 비운다.
        }

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
                return RESTful.get(String.format(
                        "http://192.168.0.6:8080/teacher/json/list?pageNo=%d&pageSize=%d",
                        params[0], params[1]));

            } catch (Exception e) {
                Log.e(TAG, Utils.toDetailMessage(e));
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
                // Teacher 객체를 TeacherAdapter에 저장한다.
                listAdapter.reset(); // TeacherAdapter의 데이터를 초기화시킨다.
                for (int i = 0; i < data.length(); i++) {
                    listAdapter.addItem(Teacher.valueOf(data.getJSONObject(i)));
                }

                // TeacherAdapter에 저장된 새 데이터를 ListView에 다시 출력한다.
                // => Adapter에 데이터가 추가, 삭제, 변경된 다음에는
                //    반드시 ListView에게 알려 화면을 갱신하게 만들어야 한다.
                listAdapter.notifyDataSetChanged();

            } catch (Exception e) {
                Toast.makeText(getApplicationContext(),
                        e.getMessage(), Toast.LENGTH_LONG).show();

                // 어떤 오류인지 자세한 내용은 로그로 출력한다.
                Log.e(TAG, Utils.toDetailMessage(e));
            }
        }
    }

}
