/* 클래스 - 파라미터가 있는 생성자
 * - 파라미터 있는 생성자를 호출하려면 인스턴스를 만들 때 값을 설정해야 한다.
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	// 클래스 인스턴스 생성
	//Calculator c1; // 컴파일 오류! 파라미터가 있는 생성자를 호출하려면 반드시 값을 넘겨줘야 한다.
	Calculator c1(100); // 변수명 옆에 함수처럼 파라미터를 지정하면 된다.

	c1.plus(10);
	c1.plus(20);
	c1.plus(30);
	c1.minus(7);

	cout << "결과: " << c1.getResult() << endl;


	return 0;
}




