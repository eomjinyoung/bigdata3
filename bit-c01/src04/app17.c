/* 포인터 - call by reference, call by value
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void f1(int p1) {
	p1 = 100;
}

void f2(int *p1) {
	*p1 = 100;
}

int main17(void) {
	int p1 = 30;

	// call by value
	// => 함수를 호출할 때 아규먼트로 값을 넘긴다.
	f1(p1); // 즉 p1 변수에 들어 있는 값을 넘긴다.

	printf("p1=%d\n", p1);

	// call by reference
	// => 함수를 호출할 때 아규먼트로 메모리의 주소를 넘긴다.
	f2(&p1);

	printf("p1=%d\n", p1);


	return EXIT_SUCCESS;
}









