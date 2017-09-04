/* 함수 - .c 파일에서만 사용하도록 변수와 함수의 사용범위를 제어
 * => 글로벌 변수에 static 붙이면 해당 .c 파일에서만 사용될 수 있다.
 * => 함수에 static을 붙이면 .c 파일에서만 사용될 수 있다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// app27_a.c 에 선언된 변수
int app27_sum = 0;

// app27_a.c 에 정의된 함수
void app27_plus(int value) {app27_sum += value;}
void app27_minus(int value) {app27_sum -= value;}

// app27_b.c 에 정의된 함수
// => static이 붙은 함수를 이 파일에서 사용할 수 없기 때문에 function prototype을 선언해봐야 소용없다.
//void app27_multiple(int);
//void app27_divide(int);
void app27_test();

int main(void) {
	app27_plus(100);
	app27_plus(27);
	app27_plus(37);
	app27_minus(5);
	app27_minus(6);
	printf("합계=%d\n", app27_sum);

	// app27_b.c 파일에서 static으로 선언된 함수를 사용할 수 없다.
	//app27_divide(6); // 컴파일 오류!
	//app27_multiple(3); // 컴파일 오류!

	// static 이 안붙은 함수는 언제든지 사용할 수 있다.
	app27_test();

	return EXIT_SUCCESS;
}







