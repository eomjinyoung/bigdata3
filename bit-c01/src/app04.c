/* 변수와 데이터형 - 논리 데이터 타입 boolean(?), BOOLEAN(?)
 * => C 언어는 논리 값을 표현하는 true, false 가 없다.
 *    또한 논리 값만 전문적으로 저장할 수 있는 데이터 타입도 없다.
 *    그래서 보통 매크로(macro) 명령을 사용하여 따로 정의해서 쓴다.
 * => 매크로?
 *    - 컴파일하기 전에 수행되는 명령이다.
 *    - 매크로 컴파일러가 먼저 매크로 명령을 처리한 후에 C 컴파일러가 .c 파일을 컴파일 한다.
 *    - 문법:
 *      #명령어 아규먼트 ...
 *
 */

#include <stdio.h>
#include <stdlib.h>

// C는 boolean 타입이 없다. char를 true, false 값을 저장하는 용도로 사용한다.
// 해결책? 매크로(macro) 명령을 사용하여 char에 대해 boolean이라는 별명을 추가한다.
// 문법
// #define  이름   값
// => 매크로 컴파일러는 .c 소스 파일에서 해당 '이름'을 모두 찾아 '값'으로 대체한다.
#define boolean char

// C는 true, false라는 값이 없다.
// 해결책? 매크로(macro) 명령을 사용하여 따로 정의한다.
#define true 1
#define false 0

int main04(void) {
	boolean b1 = true, b2 = false;

	printf("%d, %d\n", b1, b2);

	return EXIT_SUCCESS;
}



