/* v07 => 연산자 처리를 static 함수를 이용하여 수행한다.
 *        - 연산을 수행하는 부분을 함수로 분리한다.
 *        - 분리된 함수는 calculator.c 에서만 사용되도록 static으로 접근을 제한한다.
 * v06 => 구조체 포인터를 이용하여 입력 값과 결과 값을 다룬다.
 * v05 => 구조체를 이용하여 입력 값과 결과 값을 다룬다.
 * v04 => 함수들을 유지보수 하기 좋게 별도의 파일로 분리하기.
 * v03 => 코드를 함수로 쪼갠다.
 * v02 => 입력 받은 식을 계산하여 결과를 출력한다.
 * v01 => 사용자로부터 식을 입력 받는다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "view.h"
#include "calculator.h"

int main(void) {
	Expr exprVal;

	prompt("input: ", &exprVal);
	compute(&exprVal);
	displayResult(exprVal); // 내용을 변경하면 안되기 때문에 파라미터로 값을 넘긴다.

	return EXIT_SUCCESS;
}
