/* 변수와 데이터형 - signed와 unsigned 한정사
 * => signed : 기본 한정사. 생략가능. 음수까지 표현.
 * => unsigned : 붙여야 한다. 메모리 전체를 양수 값만 저장한다.
 */

#include <stdio.h>
#include <stdlib.h>



int main03(void) {
	char c1 = -128, c2 = 127;  // = signed char
	printf("%d, %d\n", c1, c2);

	signed char c3 = -128, c4 = 127;
	printf("%d, %d\n", c3, c4);

	unsigned char c5 = 0, c6 = 255; // 0 ~ 255
	printf("%d, %d\n", c5, c6);

	signed char c7 = 255; // 최대 127까지만 저장 가능. 127을 넘으면 음수로 간주한다.
	printf("%d\n", c7);

	unsigned char c8 = -128; // 최하 0까지만 저장 가능. 음수를 저장하면 특정 양수 값으로 간주한다.
	printf("%d\n", c8);

	// C 언어는 타입 안전하지 않다.
	// 즉 타입의 허용 범위를 벗어나는 값을 넣으면, 크기를 넘어가는 값을 짤라 입력한다.
	// 자바처럼 컴파일 오류나 실행 오류를 띄우지 않는다.
	// 그래서 메모리에 값을 넣을 주의하여야 한다.
	// C의 이런 자유로움(?) 때문에 좀 더 안전한 시스템을 만들고자
	// 자바와 같이 type safe를 추구하는 언어가 등장하게 되었다.
	unsigned char c9 = -1000;
	printf("%d\n", c9);

	return EXIT_SUCCESS;
}
