/* 포인터 - 동적 메모리 생성과 포인터 변수
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main19(void) {
	// 임의의 메모리를 만드는 방법
	char *p = (char*) malloc(20); // 20 바이트를 생성한다. = char p[20]

	// 사용전 초기화시키기
	memset(p, 0, 20);

	// 메모리에 문자열 저장
	strcpy(p, "Hello, world!");

	// 메모리에 저장된 값 출력
	printf("%s\n", p);

	return EXIT_SUCCESS;
}









