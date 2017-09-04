/* 함수 - 변수의 사용 범위 제어 II
 * => app26.c에 선언된 글로벌 변수 사용하기
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 다른 파일(app26.c)에 선언된 변수를 사용하겠다고 선언하기
extern int app26_sum;

// 글로벌 변수를 사용하는 함수
void app26_multiple(int value) {app26_sum *= value;}
void app26_divide(int value) {app26_sum /= value;}





