/* 구조체 - 구조체 값 리턴하기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct app53_point {
	int x;
	int y;
};

struct app53_point app53_f1() {
	struct app53_point p;
	p.x = 100;
	p.y = 200;
	return p; // 구조체 값을 리턴한다.
}

int main53(void) {

	struct app53_point p;

	p = app53_f1();

	printf("main() => (%d,%d)\n", p.x, p.y);


	return EXIT_SUCCESS;
}







