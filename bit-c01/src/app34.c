/* 연산자 - 비트 이동 연산자(<<, >>)
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main34(void) {

	// a << x => a * 2**x
	int a = 5; // 0000 0101
	printf("%d << 1 = %d\n", a, a << 1); // 5 * 2
	printf("%d << 2 = %d\n", a, a << 2); // 10 * 2
	printf("%d << 3 = %d\n", a, a << 3); // 20 * 2

	// a >> x => a / 2**x
	a = 93; // 0101 1101
	printf("%d >> 1 = %d\n", a, a >> 1); // 93 / 2
	printf("%d >> 2 = %d\n", a, a >> 2); // 46 / 2
	printf("%d >> 3 = %d\n", a, a >> 3); // 23 / 2
	return EXIT_SUCCESS;
}







