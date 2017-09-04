/* 연산자 - 증가/감소 연산자(++, --) II
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main33(void) {

	int a = 5;
	int b = a++ + a++ + a++; // b = 5 + 6 + 7
	printf("a=%d, b=%d\n", a, b);

	a = 5;
	b = a++ + a++ * a++; // b = 5 + 6 * 7
	printf("a=%d, b=%d\n", a, b);

	return EXIT_SUCCESS;
}







