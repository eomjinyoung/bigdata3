/* 함수 - 변수의 사용 범위 제어 II
 * => 글로벌 변수 :
 *    - .c 파일에서 함수 바깥에 선언된 변수
 *    - 이 변수는 선언된 파일에서만 접근할 수 있다.
 *    - 다른 파일에서 이 파일에 선언된 글로벌 변수를 사용하려면 다음과 같이
 *      "외부 파일에 선언된 이러이러한 변수를 사용하겠다!" 라고 선언해줘야 한다.
 *           extern 데이터타입 다른파일에선언된변수명;
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app26_sum = 0;

// 글로벌 변수를 사용하는 함수
void app26_plus(int value) {app26_sum += value;}
void app26_minus(int value) {app26_sum -= value;}

// 다른 .c 파일에 선언된 함수를 사용하려면 먼저 function prototype을 선언해야 한다.
void app26_multiple(int);
void app26_divide(int);

int main(void) {
	app26_plus(100);
	app26_plus(27);
	app26_plus(37);
	app26_minus(5);
	app26_minus(6);

	// 다른 파일에 선언된 함수 호출하기
	app26_divide(6);
	app26_multiple(3);

	printf("합계=%d\n", app26_sum);

	return EXIT_SUCCESS;
}







