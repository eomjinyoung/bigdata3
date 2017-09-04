/* 포인터 - 포인터 변수와 배열 II
 * => 포인터 변수의 주소에 대해 계산을 수행할 수 있다.
 *    이를 통해 메모리를 돌아다니는 것이 것이 가능하다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main14(void) {
	int a1[] = {101, 102, 103, 104, 105};

	int *p = a1;

	// 포인터를 배열처럼 사용하기
	for (int i = 0; i < 5; i++) {
		printf("%d,", p[i]);
	}
	printf("\n");

	// 포인터의 주소를 계산하여 배열의 항목을 찾기
	// => int 타입일 경우 주소에 더하는 단위는 4바이트이다.
	for (int i = 0; i < 5; i++) {
		printf("%d,", *(p + i)); // 즉 p에 저장된 주소에 4바이트 단위로 더한다.
	}
	printf("\n");


	// 다른 타입의 예
	// => char 타입일 경우 주소에 더하는 단위는 1바이트이다.
	char str[] = "Hello";
	char *p2 = str;
	for (int i = 0; i < strlen(str); i++) {
		printf("%c,", p2[i]);
	}
	printf("\n");

	for (int i = 0; i < strlen(str); i++) {
		printf("%c,", *(p2 + i));
	}
	printf("\n");


	return EXIT_SUCCESS;
}









