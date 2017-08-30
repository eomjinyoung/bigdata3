package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TeacherActivity extends AppCompatActivity {
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
}
