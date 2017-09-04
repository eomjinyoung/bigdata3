/* 구조체 - typedef III
 * => 함수 포인터의 typedef
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app57_plus(int a, int b) {return a + b;}
int app57_minus(int a, int b) {return a - b;}
int app57_multiple(int a, int b) {return a * b;}
int app57_divide(int a, int b) {return a / b;}

// 함수 포인터 타입을 선언하는 방법
typedef int (*Func)(int, int);

int main57(void) {

	// 함수 포인터를 사용하여 함수 주소를 받기
	int (*f)(int, int); // OK!
	Func f2;

	// 함수 주소 저장
	f = app57_multiple;
	f2 = app57_minus;

	// 함수 호출
	printf("%d\n", f(5, 7));
	printf("%d\n", f2(5, 7));

	return EXIT_SUCCESS;
}







