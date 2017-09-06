#include "Calculator.h"

// 클래스의 함수 정의
void Calculator::plus(int value) {
	result += value;
}

void Calculator::minus(int value) {
	result -= value;
}

void Calculator::reset() {
	result = 0;
}

int Calculator::getResult() {
	return result;
}
