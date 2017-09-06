/* 클래스 - 생성자
 * - 인스턴스를 생성한 후 자동으로 호출되는 함수
 * - 생성자는 리턴 타입이 없다.
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	// 클래스 인스턴스 생성
	Calculator c1; // 인스턴스를 만든 후 기본 생성자를 자동으로 호출한다.

	c1.plus(10);
	c1.plus(20);
	c1.plus(30);
	c1.minus(7);

	cout << "결과: " << c1.getResult() << endl;


	return 0;
}




