/* 클래스 - 인스턴스 참조(reference)
 * => 인스턴스에 별명을 추가하는 방법
 *
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	Calculator obj;
	obj.plus(100);
	obj.minus(77);
	cout << "p1 결과: " << obj.getResult() << endl;

	Calculator& r1 = obj; // obj 인스턴스에 r1라는 이름을 추가한다.
	                     // r1 는 메모리가 아니라 라벨이다.

	Calculator* p1 = &obj; // obj 인스턴스의 주소를 p1 포인터 변수에 추가한다.
						   // p1은 주소를 저장하고 있는 분명한 메모리이다.

	// 증명! 각 변수의 주소를 출력해보자!
	cout << &obj << "," << &r1 << "," << &p1 << endl;

	// 주의) 레퍼런스는 변수가 아니기 때문에 다른 인스턴스의 주소를 받을 수 없다.
	Calculator obj2;
	r1 = obj2; // 이 명령은 무시된다.
			   // 레퍼런스는 선언할 때 초기화시켜야 하고, 변경할 수 없다.
	           // 이와 같이 나중에 따로 값을 할당하려하면 무시되거나 컴파일 오류가 발생한다.
	r1.plus(100);
	cout << r1.getResult() << "," << obj.getResult()
		 << "," << obj2.getResult() << endl;

	// 참고) 포인터는 변수이기 때문에 언제든지 다른 인스턴스의 주소를 받을 수 있다.
	p1 = &obj2;
	p1->plus(300);
	cout << obj.getResult() << ","
	     << r1.getResult() << ","
		 << obj2.getResult() << ","
		 << p1->getResult() << endl;

	return 0;
}




