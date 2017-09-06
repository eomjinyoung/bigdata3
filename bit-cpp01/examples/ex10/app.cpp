/* 클래스 - 힙(heap)에 인스턴스 생성하기
 * - 힙 메모리 영역에 인스턴스를 생성하면,
 *   delete으로 제거하거나 프로그램이 종료될 때까지 유지된다.
 * - 인스턴스 생성
 *   클래스 * 포인터변수 = new 클래스명();
 * - 인스턴스 제거
 *   delete 포인터변수;
 *
 */
#include <iostream>
#include "Calculator.h"

using namespace std;

int main() {
	//Calculator* p1 = new Calculator; // OK!
	Calculator* p1 = new Calculator(); // OK!
	p1->plus(10);
	p1->minus(7);
	cout << "결과: " << p1->getResult() << endl;
	delete p1; // 사용 후 제거하지 않으면 프로그램이 종료될 때까지 힙에 계속 존재한다.
	           // 이렇게 작은 예제에서는 굳이 지울 필요가 없지만,
			   // 서버 프로그램처럼 24시간 365일 내내 실행하는 경우
			   // 메모리가 계속 증가되는 치명적인 문제를 낳을 수 있다.

	Calculator* p2 = new Calculator(100); // OK!
	p2->plus(10);
	p2->minus(7);
	cout << "결과: " << p2->getResult() << endl;
	delete p2;

	return 0;
}




