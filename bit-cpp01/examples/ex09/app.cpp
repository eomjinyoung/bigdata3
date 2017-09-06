/* 클래스 - 생성자 오버로딩과 생성자 호출 방법
 * - 객체지향 프로그램 언어의 기본 특징인 오버로딩을 생성자에 적용할 수 있다.
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	// 인스턴스를 생성한 후 기본 생성자를 호출한다.
	Calculator c1; // 빈 괄호를 치면 안된다.
	c1.plus(10);
	c1.minus(7);
	cout << "결과: " << c1.getResult() << endl;

	// 인스턴스를 생성한 후 int 값을 값을 받는 생성자를 호출한다.
	Calculator c2(100);
	c2.plus(10);
	c2.minus(7);
	cout << "결과: " << c2.getResult() << endl;

	Calculator c3(); // Calculator의 인스턴스 값을 리턴하는 c3() 함수를 의미한다.
	                 // 기본 생성자를 호출하는 문법이 아니다.
	// c3가 함수이기 때문에 다음 문장은 컴파일 오류를 발생시킨다.
	//c3.plus(10);
	//c3.minus(7);
	//cout << "결과: " << c3.getResult() << endl;

	// 인스턴스를 생성한 후 int 값을 값을 받는 생성자를 호출한다.
	Calculator c4 = Calculator(300);
	c4.plus(10);
	c4.minus(7);
	cout << "결과: " << c4.getResult() << endl;

	// 인스턴스를 생성한 후 기본 생성자를 호출한다.
	Calculator c5 = Calculator();
	c5.plus(10);
	c5.minus(7);
	cout << "결과: " << c5.getResult() << endl;

	return 0;
}




