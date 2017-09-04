/* enum - 상수 값을 정의할 때 많이 사용한다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 상수를 정의 하는 방법
// 1) 매크로 사용하기
#define C 		0
#define CPP 	1
#define JAVA 	2
#define PYTHON 	3

// 2) enum을 이용하는 방법
// => 상수 값은 변수가 선언된 순서대로 0부터 증가하는 정수이다.
enum language {
	LANG_C, LANG_CPP, LANG_JAVA, LANG_PYTHON
};

// => enum의 이름은 선택사항이다. 지정하지 않아도 된다.
enum {
	LANG2_C, LANG2_CPP, LANG2_JAVA, LANG2_PYTHON
};

// => 특정 값으로 지정하고 싶다면 = 연산자를 사용하여 값을 설정하라!
enum {
	LANG3_C = 100, LANG3_CPP = 200, LANG3_JAVA = 300, LANG3_PYTHON = 400
};

int main62(void) {
	printf("%d\n", JAVA);
	printf("%d\n", LANG_JAVA);
	printf("%d\n", LANG2_JAVA);
	printf("%d\n", LANG3_JAVA);

	return EXIT_SUCCESS;
}







