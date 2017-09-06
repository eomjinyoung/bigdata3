/* 클래스 - 인스턴스의 값 복사
 * => 인스턴스의 값 복사를 기본으로 제공한다.
 *
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	Calculator p1;
	p1.plus(100);
	p1.minus(77);
	cout << "p1 결과: " << p1.getResult() << endl;

	Calculator p2; // p1과 다른 새 인스턴스
	p2 = p1; // p1의 값을 p2 인스턴스에 복사하는 것이다.
	p2.plus(100);
	p2.minus(77);
	cout << "p2 결과: " << p2.getResult() << endl;

	cout << "p1 결과: " << p1.getResult() << endl;


	return 0;
}




