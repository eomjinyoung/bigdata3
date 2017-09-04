/* 변수와 데이터형 - 상수의 정의
 * => #define 매크로 명령을 사용하여 상수를 정의한다.
 *    예) #define 상수명  값
 * => const 한정사를 변수 선어에 붙인다.
 *    예) const int a = 100;
 */

#include <stdio.h>
#include <stdlib.h>

#define PI 				3.14159
#define MAX_SCORE 		100
#define MIN_SCORE 		0
#define NEWLINE 		'\n'
#define HELLO 			"hello"

int main05(void) {

	printf("%f\n", PI);
	printf("%d ~ %d\n", MIN_SCORE, MAX_SCORE);
	printf("%c\n", NEWLINE);
	printf("%s\n", HELLO);

	// 상수 변수 선언
	const int a = 10;
	printf("%d\n", a);

	//a = 20; // 컴파일 오류! 상수 변수는 값을 변경할 수 없다.


	// 상수 변수의 값은 선언할 때 할당해야 한다.
	// 선언 후에는 값을 넣을 수 없다.
	const int b;
	//b = 100; // 컴파일 오류!
	printf("%d\n", b); // 변수의 값을 초기화시키지 않은 상태에서 값을 출력하면
	                   // 재활용한 메모리에 남아 있는 값이 출력된다.

	return EXIT_SUCCESS;
}



