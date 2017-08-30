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

        this.listView = (ListView) this.findViewById(R.id.list);
        //this.listAdapter.
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
            return itemView;
        }
    }
}
