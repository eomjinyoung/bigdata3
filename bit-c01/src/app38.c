/* 조건문 - else의 소속
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main38(void) {
	int age = 9;

	if (age > 13)
		if (age > 18)
			printf("성인\n");
	else // else는 항상 가장 가까이에 있는 if와 묶인다. 따라서 이 else 문은 바로 전 if (age > 1*)문과 묶인다.
		printf("어린이\n");

	printf("--------------------------\n");

	if (age > 13) {
		if (age > 18)
			printf("성인\n");
	}
	else
		printf("어린이\n");

	return EXIT_SUCCESS;
}







