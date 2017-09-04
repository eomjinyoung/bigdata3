/* 조건문 - if
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main35(void) {
	int a = 5;

	if (a > 0)
		printf("a는 양수이다.\n");

	// c에서는 조건 논리 값으로 숫자를 사용한다.
	// 0(false), 그 외 모든 수(true)
	if (a = 10) // a 변수에 10을 넣는다. 10은 true로 간주한다.
		printf("a는 10이다.\n");


	return EXIT_SUCCESS;
}







