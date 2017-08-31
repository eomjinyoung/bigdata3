/* 변수와 데이터형 - 포인터 변수와 배열 II
 * => 포인터 변수의 주소에 대해 계산을 수행할 수 있다.
 *    이를 통해 메모리를 돌아다니는 것이 것이 가능하다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	int a1[] = {101, 102, 103, 104, 105};

	int *p = a1;

	// 포인터를 배열처럼 사용하기
	for (int i = 0; i < 5; i++) {
		printf("%d,", p[i]);
	}
	printf("\n");

	// 포인터의 주소를 계산하여 배열의 항목을 찾기
	for (int i = 0; i < 5; i++) {
		printf("%d,", *(p + i));
	}
	printf("\n");


	return EXIT_SUCCESS;
}









