/* 클래스 - 인스턴스 참조(reference) II
 * => 함수의 파라미터에서 참조를 사용하기
 *
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

void swap1(int a, int b) {
	int temp = a;
	a = b;
	b = temp;
}

void swap2(int* a, int* b) { // 변수의 주소를 받는 파라미터
	int temp = *a;
	*a = *b;
	*b = temp;
}

void swap3(int& a, int& b) { // 변수에 추가로 이름을 붙이는 파라미터
	// 파라미터로 레퍼런스를 사용하게 되면 포인터 변수보다 코드를 작성하기가 편리하다.
	// 포인터 변수를 다룰 때는 항상 * 기호를 사용해야 했다.
	int temp = a;
	a = b;
	b = temp;
}

int main() {
	int a = 10;
	int b = 20;

	swap1(a, b);
	cout << "a=" << a << "," << "b=" << b << endl;

	a = 10, b = 20;
	swap2(&a, &b);
	cout << "a=" << a << "," << "b=" << b << endl;

	a = 10, b = 20;
	swap3(a, b);
	cout << "a=" << a << "," << "b=" << b << endl;

	return 0;
}




