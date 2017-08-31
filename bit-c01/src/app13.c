/* 변수와 데이터형 - 포인터 변수 III
 * => 보통 포인터 변수는 단일 변수의 주소를 저장하기 보다는
 *    배열의 주소를 저장하는 데 주로 사용한다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	int a1[] = {100, 100, 100, 100, 100};
	int a2[] = {90, 90, 90, 90};
	int v1 = 120;

	int *p;

	//1) 포인터 변수는 단일 변수의 주소를 저장한다.
	p = &v1;
	printf("%d\n", *p);



	return EXIT_SUCCESS;
}









