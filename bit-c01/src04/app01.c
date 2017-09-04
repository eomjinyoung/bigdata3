/* 변수와 데이터형 - 기본 데이터 타입
 */

#include <stdio.h>
#include <stdlib.h>



int main01(void) {
	char c; // 1 바이트 문자 코드를 저장할 때 사용하는 변수
	int i; // 정수 값 저장. 기종에 따라(16비트, 32비트, 64비트) 크기가 결정된다.
	float f; // 단정도(32비트) 부동 소수점. 유효자릿수 7자리.
	double d; // 배정도(64비트) 부동 소수점. 유효자릿수 15자리.

	printf("char=%d\n", sizeof(char)); // 1 바이트
	printf("int=%d\n", sizeof(int)); // 4바이트
	printf("float=%d\n", sizeof(float)); // 4바이트
	printf("double=%d\n", sizeof(double)); // 8바이트

	return EXIT_SUCCESS;
}
