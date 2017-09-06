/* 클래스 - 인스턴스 초기화 명령
 * => 인스턴스를 생성할 때 생성자 처럼 초기화시키는 방법
 *
 */
#include <iostream>
#include <cstring> // c언의 표준 라이브러리인 string.h를 c 언어에 맞게 변환한 헤더파일.
#include "Calculator.h"

using namespace std;

int main() {
	// 배열 초기화 예:
	int arr[] = {10, 20, 30};
	cout << "배열 값: " << arr[0] << "," << arr[1] << "," << arr[2] << endl;

	// 구조체 초기화 예:
	struct student {
		char* pName;
		int age;
	};
	struct student s1 = {new char[20], 20};
	strcpy(s1.pName, "홍길동");
    cout << "구조체 값: " << s1.pName << "," << s1.age << endl;

    // 클래스의 인스턴스 초기화 예:
	Calculator p1 = Calculator {100}; // OK
	//Calculator p1 {100}; // 위 문장의 단축 문법
	p1.plus(100);
	p1.minus(77);
	cout << "결과: " << p1.getResult() << endl;


	return 0;
}




