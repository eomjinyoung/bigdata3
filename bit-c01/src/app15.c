/* 포인터 - 포인터 변수의 주소를 저장하는 방법
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main15(void) {
	int v1 = 100;
	int *p1 = &v1;
	int **p2 = &p1;

	printf("%x, %x, %x, %x\n", v1, &v1, &p1, &p2);
	printf("%x, %x, %x, %x\n", v1, p1, p2, &p2);
	printf("%x, %x, %x\n", v1, *p1, **p2);

	return EXIT_SUCCESS;
}









