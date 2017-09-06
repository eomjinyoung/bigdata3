#include <iostream>
#include "Calculator.h"

Calculator::Calculator() {
	std::cout << "Calculator()..." << std::endl;
	result = 0;
}

Calculator::Calculator(int value) {
	std::cout << "Calculator(int)..." << std::endl;
	result = value;
}

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
