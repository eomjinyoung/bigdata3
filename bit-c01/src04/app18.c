/* 포인터 - 함수 포인터 변수(function pointer)
 * => 함수의 주소를 저장하는 변수
 * => 문법
 *    리턴타입 (*변수명)(파라미터, ...);
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int plus(int a, int b) { return a + b; }
int minus(int a, int b) { return a - b; }
int multiple(int a, int b) { return a * b; }
int divide(int a, int b) { return a / b; }

int main18(void) {
	// 함수 포인터 선언
	// => 두 개의 int 값을 받아서 int를 리턴하는 함수의 주소를 저장할 변수 "f".
	int (*f)(int, int);

	// 함수 포인터 변수에 함수의 주소를 저장한다.
	// => 배열 변수가 배열의 주소를 표현하듯이, 함수의 이름은 함수의 주소를 표현한다.
	f = plus;

	// 함수 포인터를 이용하여 함수를 호출하기
	// => 함수를 주소를 저장했으면 그 함수처럼 이용하면 된다.
	printf("%d\n", f(10, 20));

	f = minus;
	printf("%d\n", f(10, 20));

	f = multiple;
	printf("%d\n", f(10, 20));

	f = divide;
	printf("%d\n", f(10, 20));

	return EXIT_SUCCESS;
}









