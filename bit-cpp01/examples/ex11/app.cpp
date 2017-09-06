/* 클래스 - dangling object, dangling pointer
 * => dangling object
 *    - 주소를 잃어 버려 사용할 수 없는 인스턴스
 *    - 자바에서는 "garbage"라 부른다.
 * => dangling pointer
 *    - 유효하지 않은 인스턴스를 가리키는 포인터 변수
 *    - 자바에서는 이런 경우가 없다.
 *      왜? 개발자가 임의로 힙에 생성한 인스턴스를 지울 수 없기 때문이다.
 *
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	//dangling object
	Calculator* p1 = new Calculator(); // OK!
	Calculator* p2 = new Calculator(); // OK!

	// 인스턴스의 메모리 크기
	cout << "Calculator 인스턴스 크기: " << sizeof(Calculator) << endl;
	cout << "p1의 주소: " << p1 << endl;
	cout << "p2의 주소: " << p2 << endl;
	cout << "--------------------" << endl;

	p2 = p1; // p2에 저장된 주소를 잃어 버렸기 때문에 그 주소의 객체를 사용할 수 없다.
	         // 이런 객체를 "dangling object(=garbage)"라 부른다.
	cout << "p1의 주소: " << p1 << endl;
	cout << "p2의 주소: " << p2 << endl;
	cout << "--------------------" << endl;

	p1->plus(10);
	p1->minus(7);
	cout << "결과: " << p2->getResult() << endl;
	delete p1;

	// p1, p2가 가리키는 메모리는 delete을 수행하여 해제시켰다.
	// 그래서 p1, p2 변수에 저장된 주소는 무효하다!
	// 이렇게 무효한 메모리를 가리키는 포인터 변수를 "dangling pointer"라 부른다.
	// 다음 코드는 잘못된 코드이다. 만약 제대로 실행한다 하더라도 절대 작성해서는 안된다.
	// 즉 "dangling pointer"를 사용해서는 안된다.
	cout << "결과: " << p2->getResult() << endl;

	return 0;
}




