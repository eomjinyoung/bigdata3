/* 화면 스크롤 다루기
=> HorizontalScrollView : 수평 스크롤 처리
=> ScrollView : 수직 스크롤 처리
=> ImageView : 이미지 출력 위젯

 */
package bitcamp.bigdata3.app01;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) 스크롤 적용 전
        // => ImageView의 출력 내용중 일부만 화면에 보여진다.
        //setContentView(R.layout.activity_main1);

        //2) 수평 스크롤 적용
        // => HorizontalScrollView 이용하여 수평 스크롤을 처리한다.
        //setContentView(R.layout.activity_main2);

        //3) 수직 스크롤 적용
        // => ScrollView 이용하여 수직 스크롤을 처리한다.
        //setContentView(R.layout.activity_main3);

        //4) 자바 코드로 이미지 설정하기
        // => 일단은 설계도에 따라 화면을 준비해야 한다.
        setContentView(R.layout.activity_main4);

        //=> 앱에 포함된 자원을 찾는 도구를 준비한다.
        Resources res = this.getResources();

        //=> 자원 찾는 도구를 사용하여 이미지 파일을 준비한다.
        BitmapDrawable bitmap = (BitmapDrawable)res.getDrawable(R.drawable.test01);

        //=> 비트맵의 크기를 알아낸다.
        int width = bitmap.getIntrinsicWidth();
        int height = bitmap.getIntrinsicHeight();

        //=> 이미지 파일을 설정한 ImageView 객체를 찾는다.
        ImageView imageView = (ImageView)this.findViewById(R.id.image1);

        //=> ImageView 객체에 이미지 파일을 설정한다.
        imageView.setImageDrawable(bitmap);
        ViewGroup.LayoutParams imageViewParams = imageView.getLayoutParams();
        imageViewParams.width = width;
        imageViewParams.height = height;

    }





}
