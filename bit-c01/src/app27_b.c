/* 함수 - static 변수와 함수
 * => 글로벌 변수나 함수 앞에 static을 붙이면
 *    해당 변수나 함수를 선언한 .c 파일 안에서만 사용될 수 있다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// app27_b.c 에서만 사용할 수 있는 변수
static int app27_sum;

// app27_b.c 에서만 사용할 수 있는 함수
static void app27_multiple(int value) {app27_sum *= value;}
static void app27_divide(int value) {app27_sum /= value;}

// static이 안붙은 일반 함수는 다른 .c 에서 사용할 수 있다.
void app27_test() {
	app27_sum = 1;
	app27_multiple(20);
	app27_divide(5);
	printf("app27_b.app27_sum=%d\n", app27_sum);
}



