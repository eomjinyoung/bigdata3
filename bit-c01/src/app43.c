/* 반복문 - for
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main43(void) {

	for (int i = 0; i < 10; i++) {
		printf("%d,", i);
	}

	//printf("i = %d\n", i); // 컴파일 에러! for 블럭에서 선언된 변수는 해당 블럭을 종료하는 순간 제거된다.

	return EXIT_SUCCESS;
}







