/* 레이아웃 다루기: TableLayout
=> 행과 열로 뷰를 배치하는 레이아웃
=> 행은 TableRow를 이용하여 표현한다.


 */
package bitcamp.bigdata3.app01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) 기본 테이블 만들기
        // => TableRow를 사용하여 행을 배치한다.
        // => 각 cell에 들어가는 뷰는 cell에 크기에 자신을 맞춘다.
        //setContentView(R.layout.activity_main1);

        //2) 열의 개수가 다를 경우
        // => 다음 열을 비워둔다.
        //setContentView(R.layout.activity_main2);

        //3) 중간 열을 비울 때
        // => 빈 셀에 임의의 뷰를 추가하라!
        //setContentView(R.layout.activity_main3);

        //4) cell 병합
        // => layout_span 속성을 사용한다.
        //setContentView(R.layout.activity_main4);

        //5) 뷰가 놓일 cell의 위치를 지정하기
        // => layout_column 속성을 사용한다.
        // => 인덱스는 0부터 시작한다.
        //setContentView(R.layout.activity_main5);

        //6) cell의 너비와 높이
        // => 열의 너비는 그 열에서 가장 큰 뷰의 크기로 결정된다.
        // => 행의 높이는 그 행에서 가장 큰 뷰의 크기로 결정된다.
        //setContentView(R.layout.activity_main6);

        //7) 특정 열이 부모의 나머지 영역을 차지하게 만들기
        setContentView(R.layout.activity_main7);
    }





}
