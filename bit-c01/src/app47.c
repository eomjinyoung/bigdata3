/* 구조체 - 정의와 사용
 * => 사용자 데이터 타입을 정의하는 문법이다.
 *    다만, 이 데이터 타입의 값을 다루는 연산자는
 *    따로 함수를 정의해서 사용해야 한다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main47(void) {

	// => x, y 좌표 값을 표현한 데이터 타입 정의
	struct point {
		int x;
		int y;
	};

	// => 새로 정의한 구조에 맞춰 메모리 준비
	struct point p1;
	struct point p2;

	// => 구조체 메모리에 값을 넣기
	p1.x = 100;
	p1.y = 200;
	p2.x = 20;
	p2.y = 30;

	// => 구조체의 값을 꺼내기
	printf("(x, y) = (%d, %d)\n", p1.x, p1.y);
	printf("(x, y) = (%d, %d)\n", p2.x, p2.y);


	return EXIT_SUCCESS;
}







