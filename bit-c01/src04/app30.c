/* 연산자 - 논리 연산자(&&, ||, !)
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main30(void) {
	// && => 둘 다 true 일 때만 true를 리턴한다.
	// || => 둘 중 한 개라도 true이면 true를 리턴한다.
	// true => 0이외의 모든 숫자는 true이다.
	// false => 0
	printf("5 && 2 = %d\n", 5 && 2);
	printf("5 || 2 = %d\n", 5 || 2);

	printf("5 && 0 = %d\n", 5 && 0);
	printf("5 || 0 = %d\n", 5 || 0);

	printf("-5 && 0 = %d\n", -5 && 0);
	printf("-5 || 0 = %d\n", -5 || 0);

	printf("!5 = %d\n", !5);
	printf("!-5 = %d\n", !-5);
	printf("!0 = %d\n", !0);

	return EXIT_SUCCESS;
}







