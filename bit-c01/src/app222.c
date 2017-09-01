/* 포인터 - void 포인터 변수
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(void) {
	char c = 'A';
	int i = 100;
	float f = 3.14;

	// 메모리의 주소를 저장할 때는 그 타입의 포인터 변수에 저장해야 한다.
    char *p1 = &c;
	int *p2 = &i;
	float *p3 = &f;

	// void는 데이터 타입이 아니기 때문에 변수를 선언할 수 없다.
	// void p4; // 컴파일 오류!

	// 단 포인터 변수를 선언할 때 void를 사용할 수 있다.
	void *p5;

	// void 포인터 변수의 의미?
	// => 여러 타입의 주소를 저장할 때 사용한다!
	p5 = &c; // char 메모리의 주소도 저장할 수 있다.
	printf("%c\n", *((char*)p5)); // 다만 그 주소를 사용할 때는 원래의 타입으로 형변환 한 후 사용하라!

	p5 = &i; // int 메모리의 주소도 저장할 수 있다.
	printf("%d\n", *((int*)p5));

	p5 = &f; // float 메모리의 주소도 저장할 수 있다.
	printf("%f\n", *((float*)p5));

	return EXIT_SUCCESS;
}










