/* 컴파일과 실행 II
=> 여러 개의 소스 파일을 컴파일하기
   1) .c 파일 각각에 대해 기계어 파일(.o 또는 .obj)을 만든다.
   2) 링킹 과정에서 한 개의 실행 파일로 합쳐진다.

 */

#include <stdio.h>
#include <stdlib.h>

// 다른 파일에 정의되어 있는 함수를 사용할 때는 사용하기 전에
// 함수의 형태에 대한 정보(무슨 타입의 데이터를 받아서 무슨 타입의 데이터를 리턴하는지에 대한 정보)를
// 먼저 설정해야 한다.
// 물론 요즘 컴파일러는 똑똑해서 알려주지 않아도 대충 찾아서 사용하지만, 바람직하지 않다.
int plus(int, int); // plus() 함수의 형태 정보 => "function prototype"이라 부른다.
int minus(int, int); // minus() 함수의 형태 정보 => "function prototype"이라 부른다.

int main(void) {
	printf("10 + 20 = %d\n", plus(10, 20));
	printf("10 - 20 = %d\n", minus(10, 20));

	return EXIT_SUCCESS;
}
