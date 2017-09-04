/* 구조체 - 구조체와 포인터
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main49(void) {

	struct point {
		int x;
		int y;
	};

	struct point p1;
	p1.x = 100; p1.y = 200;
	printf("(x, y) = (%d, %d)\n", p1.x, p1.y);

	struct point *p2;
	p2 = &p1;

	// 포인터 변수를 통해 구조체의 멤버에 접근할 때는 점(.) 대신에 화살표(->)를 사용해야 한다.
	p2->x = 500;
	printf("(x, y) = (%d, %d)\n", p1.x, p1.y);

	return EXIT_SUCCESS;
}







