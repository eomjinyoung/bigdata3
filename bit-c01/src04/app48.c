/* 구조체 - 데이터 타입 정의와 변수 선언을 한 번에 하기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main48(void) {

	// => x, y 좌표 값을 표현한 데이터 타입 정의 + 변수 정의
	// => 구조체를 정의한 후에 바로 이어서 변수를 선언할 수 있다.
	struct point {
		int x;
		int y;
	} p1, p2;

	struct point p3; // 구조체를 정의할 때 동시에 변수를 선언했다 할지라도
	                 // 이렇게 나중에 따로 변수를 선언하는데 문제가 없다.

	// => 구조체 메모리에 값을 넣기
	p1.x = 100; p1.y = 200;
	p2.x = 20; p2.y = 30;
	p3.x = 55; p3.y = 66;

	// => 구조체의 값을 꺼내기
	printf("(x, y) = (%d, %d)\n", p1.x, p1.y);
	printf("(x, y) = (%d, %d)\n", p2.x, p2.y);
	printf("(x, y) = (%d, %d)\n", p3.x, p3.y);


	return EXIT_SUCCESS;
}







