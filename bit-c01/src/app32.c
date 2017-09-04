/* 연산자 - 증가/감수 연산자(++, --)
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main32(void) {

	int a = 10;
	int b = ++a;
	printf("a=%d, b=%d\n", a, b);

	a = 10;
	b = --a;
	printf("a=%d, b=%d\n", a, b);

	a = 10;
	b = a++;
	printf("a=%d, b=%d\n", a, b);

	a = 10;
	b = a--;
	printf("a=%d, b=%d\n", a, b);

	return EXIT_SUCCESS;
}







