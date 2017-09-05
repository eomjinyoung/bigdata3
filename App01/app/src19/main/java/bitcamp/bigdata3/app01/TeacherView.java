package bitcamp.bigdata3.app01;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by bit11 on 2017-08-30.
 */

public class TeacherView extends LinearLayout {
    TextView name;
    TextView email;

    public TeacherView(Context context) {
        super(context);

        // => XML 레이아웃 파일을 읽어 자바 객체로 바꿔줄 도구를 준비한다.
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(
                                                Context.LAYOUT_INFLATER_SERVICE);
        // View.inflate(context, R.layout.view_teacher, this);

        // => view_teacher.xml 을 읽어서 자바 UI 객체를 생성한 다음에
        //    이 LinearLayout에 붙인다.
        inflater.inflate(R.layout.view_teacher, this, true);

        name = (TextView) this.findViewById(R.id.name);
        email = (TextView) this.findViewById(R.id.email);
    }

    public void setTeacher(Teacher teacher) {
        name.setText(teacher.getName());
        email.setText(teacher.getEmail());
    }
}
