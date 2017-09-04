/* 구조체 - 구조체와 call by reference
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct app52_point {
	int x;
	int y;
};

void app52_f1(struct app52_point *p) {
	p->x = p->x + 100;
	p->y = p->y + 100;
	printf("app52_f1() => (%d,%d)\n", p->x, p->y);
}

int main(void) {

	struct app52_point p;
	p.x = 100;
	p.y = 200;

	app52_f1(&p); // 함수를 호출할 때 구조체의 주소를 넘긴다. "call by reference"

	printf("main() => (%d,%d)\n", p.x, p.y);


	return EXIT_SUCCESS;
}







