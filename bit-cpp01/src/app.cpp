/* 클래스 정의 - 헤더 파일과 소스 파일
 * - 헤더파일 : 클래스를 정의하는 코드를 둔다.
 * - 소스파일 : 클래스의 함수를 정의하는 코드를 둔다.
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	// 클래스 인스턴스 생성
	Calculator c1;

	c1.reset();
	c1.plus(10);
	c1.plus(20);
	c1.plus(30);
	c1.minus(7);

	cout << "결과: " << c1.getResult() << endl;


	return 0;
}




