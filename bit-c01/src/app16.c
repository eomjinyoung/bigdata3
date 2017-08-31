/* 변수와 데이터형 - 포인터 변수의 배열
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	// 고정 길이 2차원 배열
	int scores[3][4] = { // 3행 4열의 배열
			{91, 92, 93, 94},
			{81, 82, 83, 84},
			{71, 72, 73, 74}
	};

	for (int r = 0; r < 3; r++) {
		for (int c = 0; c < 4; c++) {
			printf("%d, ", scores[r][c]);
		}
		printf("\n");
	}

	// 가변 길이 열을 가진 배열 만들기
	int s1[] = {91, 92, 93, 94};
	int s2[] = {81, 82, 83};
	int s3[] = {71, 72};

	// 배열은 배열인데, 주소를 저장하는 배열이다. 즉 포인터 변수의 배열.
	int* p[3]; // "int*" 타입의 값을 3개 저장할 배열을 만든다.
	           // 즉 int 메모리의 주소를 3개 저장할 배열을 만든다.
	p[0] = s1;
	p[1] = s2;
	p[2] = s3;

	for (int r = 0; r < 3; r++) {
		for (int c = 0; c < (4 - r); c++) {
			printf("%d, ", p[r][c]);
		}
		printf("\n");
	}

	return EXIT_SUCCESS;
}









