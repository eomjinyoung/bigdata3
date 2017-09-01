/* 변수의 사용 범위 제어 II
 * => 글로벌 변수 :
 *    - .c 파일에서 함수 바깥에 선언된 변수
 *    - 이 변수는 선언된 파일에서만 접근할 수 있다.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app26_sum = 0;

// 글로벌 변수를 사용하는 함수
void app26_plus(int value) {app26_sum += value;}
void app26_minus(int value) {app26_sum -= value;}

int main(void) {
	app26_plus(100);
	app26_plus(27);
	app26_plus(37);
	app26_minus(5);
	app26_minus(6);

	printf("합계=%d\n", app26_sum);

	return EXIT_SUCCESS;
}







