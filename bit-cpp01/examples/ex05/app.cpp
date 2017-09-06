/* 클래스 정의 - inline 함수
 * - 클래스를 정의하는 블록 안에 함수 정의하는 것.
 *
 */
#include <iostream>
using namespace std;

class Calculator {
private:
	int result;

public:
	inline void plus(int value) {this->result += value;}
	inline void minus(int value) {result -= value;}
	inline void reset() {result = 0;}
	inline int getResult() {return result;}
};

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




