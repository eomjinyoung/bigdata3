/* 변수와 데이터형 - 기본 데이터 타입에 한정사(qualifier) 붙이기
 * => 한정사(qualifier)?
 *    - 제어나 제한을 가하기 위해 붙이는 특별한 키워드이다.
 * => short : 기존 타입 타입보다 작은 크기의 메모리를 만들기
 * => long : 기존 타입보다 큰 크기의 메모리를 만들기
 *
 */

#include <stdio.h>
#include <stdlib.h>



int main02(void) {
	// 타입 앞에 붙이는 한정사(qualifier; 제어하는 명령어)
	short int si; // 메모리의 최대 크기를 int 이하로 하라! 보통 16비트 크기를 갖는다.
	long int li; // 메모리의 최소 크기를 int 이상으로 하라! 보통 32비트 크기를 갖는다.
	//long float lf; // 컴파일 오류! float 앞에 long을 붙일 수 없다.
	long double; // double 크기 보다 더 큰 크기를 갖는다.

	printf("short int=%d\n", sizeof(short int)); // 2바이트
	printf("long int=%d\n", sizeof(long int)); // 8바이트
	printf("long double=%d\n", sizeof(long double)); // 16바이트

	// 타입 앞에 한정사를 붙이는 경우 뒤의 int를 생략할 수 있다.
	short s;
	long l;
	printf("short=%d\n", sizeof(short)); // 2바이트
	printf("long=%d\n", sizeof(long)); // 8바이트


	return EXIT_SUCCESS;
}
