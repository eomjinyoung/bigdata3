/* 변수와 데이터형 - 포인터 변수 II
 * => 여러 개의 포인터 변수 선언하기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main12(void) {
	int *p1; // c 에서 주로 포인터 변수를 선언하는 방식
	int* p2; // c++ 에서 포인터 변수를 선언하는 방식
	int v1;
	p1 = &v1;
	p2 = &v1;

	*p1 = 100;
	printf("%d\n", v1);

	*p2 = 200;
	printf("%d\n", v1);

	int *p3, *p4, v2;
	p3 = &v2;
	p4 = &v2;
	v2 = 300;
	printf("%d, %d, %d\n", *p3, *p4, v2);

	int* p5, p6; // 데이터 타입 앞에 *를 붙이는 경우 조심해서 사용하라!
	             // *는 항상 가장 가까운 변수를 가리킨다.
				 // 그래서 p5는 포인터 변수이지만, p6는 일반  int 변수가 된다.
	p5 = &v2;
	p6 = &v2;
	//printf("%d, %d\n", *p5, *p6); // p6는 일반 변수라서 컴파일 오류가 발생한다.

	return EXIT_SUCCESS;
}









