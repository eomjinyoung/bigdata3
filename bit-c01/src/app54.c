/* 구조체 - 구조체 주소 리턴하기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct app54_point {
	int x;
	int y;
};

struct app54_point *app54_f1() {
	struct app54_point p;
	p.x = 100;
	p.y = 200;
	return &p; // 로컬 구조체 메모리는 함수 호출이 끝나면 사라지기 때문에 주소를 리턴해서는 안된다.
	           // 구조체의 주소를 리턴하고 싶다면 다음 f2() 함수처럼 하라!
}

struct app54_point *app54_f2() {
	// 함수를 끝낸 후에 메모리의 주소를 리턴하고 싶다면
	// 다음과 같이 힙에 메모리를 생성하라!
	printf("구조체크기: %d\n", sizeof(struct app54_point));
	struct app54_point *p = (struct app54_point *) malloc(sizeof(struct app54_point));
	p->x = 100;
	p->y = 200;
	return p;
}

int main(void) {

	struct app54_point *p;

	//p = app54_f1(); // 컴파일 오류! 로컬 변수의 주소를 리턴 받아서는 안된다.
	p = app54_f2();

	printf("main() => (%d,%d)\n", p->x, p->y);


	return EXIT_SUCCESS;
}







