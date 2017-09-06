/* 클래스 정의
 *
 */
#include <iostream>
using namespace std;

// class 선언
// - 변수의 선언
// - 함수의 프로토타입 선언
class Calculator {
private:
	int result;

public:
	void plus(int);
	void minus(int);
	void reset();
	int getResult();
};

// 클래스의 함수 정의
void Calculator::plus(int value) {
	this->result += value;
}

void Calculator::minus(int value) {
	result -= value; // this-> 를 생략할 수 있다.
}

void Calculator::reset() {
	result = 0;
}

int Calculator::getResult() {
	return result;
}

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




