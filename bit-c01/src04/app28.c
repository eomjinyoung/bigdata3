/* 연산자 - 산술 연산자(+, -, *, /, %)
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main28(void) {
	printf("5 + 2 = %d\n", 5 + 2);
	printf("5 - 2 = %d\n", 5 - 2);
	printf("5 * 2 = %d\n", 5 * 2);
	printf("5 / 2 = %d\n", 5 / 2); // 정수와 정수의 연산결과는 정수이다.
	printf("5 %% 2 = %d\n", 5 % 2);

	printf("5 / 2 = %f\n", (float)5 / 2); // 부동소수점 / 정수 = 부동소수점 / 부동소수점(암시적형변환)
	                                      // 결과 = 부동소수점

	return EXIT_SUCCESS;
}







