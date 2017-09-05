/* v04 => 함수들을 유지보수 하기 좋게 별도의 파일로 분리하기.
 * v03 => 코드를 함수로 쪼갠다.
 * v02 => 입력 받은 식을 계산하여 결과를 출력한다.
 * v01 => 사용자로부터 식을 입력 받는다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "view.h"
#include "calculator.h"

// 여러 함수에서 사용할 수 있도록 글로벌 변수로 만든다.
int a, b;
char op;
float result;

int main(void) {

	prompt("input: ");
	compute();
	displayResult();

	return EXIT_SUCCESS;
}
