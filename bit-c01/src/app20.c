/* 포인터 - 동적 메모리 생성과 포인터 변수 II
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main20(void) {
	// int 배열 메모리를 만든다.
	// => char는 1바이트라서 그냥 크기를 지정하면 되지만,
	//    다른 타입은 크기가 다르기 때문에 sizeof(타입)을 사용해서
	//    그 타입의 크기를 알아낸 다음 몇 개의 메모리를 만들 지 그 수를 곱하라!
	//    이렇게 계산해서 생성할 메모리의 크기를 지정해야 한다.
	int *p = (int*) malloc(sizeof(int) * 5); // 20 바이트를 생성한다. = int p[20]

	// int 메모리에 값 저장
	for (int i = 0; i < 5; i++) {
		p[i] = 100 + i;
	}

	// 메모리에 저장된 값 출력
	for (int i = 0; i < 5; i++) {
		printf("%d,", p[i]);
	}
	printf("\n");

	return EXIT_SUCCESS;
}









