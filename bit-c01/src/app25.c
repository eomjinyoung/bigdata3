/* 함수 - 변수의 사용 범위 제어
 * => 로컬 변수: 함수가 호출될 때 스택 영역에 생성되고, 호출이 끝나면 제거된다.
 * => static : 함수 안에서만 사용되는 글로벌 변수
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 로컬 변수
// => 함수가 호출될 때 생성되고, 호출이 끝나면 제거되는 변수
void app25_f1(int value) {
	int sum = 0;
	sum += value;
	printf("합계=%d\n", sum);
}

// 스태틱 변수
// => 함수가 호출될 때 생성되고, 한 번 생성된 변수는 프로그램을 종료할 때까지 계속 유지된다.
// => 그 함수에서만 사용되는 글로벌 변수라 할 수 있다.
void app25_f2(int value) {
	static int sum = 0; // 처음 호출될 때 sum은 생성되고 0으로 초기화 된다.
						// 그 이후에 호출될 때는 실행되지 않는다.
	sum += value;
	printf("합계=%d\n", sum);
}

int main25(void) {
	app25_f1(100);
	app25_f1(50);
	puts("----------------------------");

	app25_f2(100);
	app25_f2(50);

	return EXIT_SUCCESS;
}







