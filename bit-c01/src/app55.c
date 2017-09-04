/* 구조체 - typedef
 * => 구조체 변수를 선언할 떄 struct 키워드를 항상 사용해야 한다.
 *    매우 번거롭고 불편하다. 이것을 해결하기 위해 등장한 문법이 typedef이다.
 *    typedef으로 기존의 타입을 의미있는 이름을 재정의하면 유지보수가 쉬워진다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct app55_point {
	int x;
	int y;
};

typedef struct app55_point Point;
typedef struct app55_point *PPoint;

PPoint app55_f2() {
	printf("구조체크기: %d\n", sizeof(Point));
	PPoint p = (PPoint) malloc(sizeof(Point));
	p->x = 100;
	p->y = 200;
	return p;
}

int main(void) {

	PPoint p;

	p = app55_f2();

	free(p);

	printf("main() => (%d,%d)\n", p->x, p->y);


	return EXIT_SUCCESS;
}







