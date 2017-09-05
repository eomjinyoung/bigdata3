/* v08 => 함수 포인터를 이용하여 연산자와 그 연산을 수행하는 함수를 관리한다.
 *        - 기존에는 switch 문을 이용하여 연산자를 처리하였다.
 *        - 이 방식은 연산자가 추가될 때마다 switch 문을 변경해야 하는 문제가 있다.
 *        - 기존 코드를 최소한으로 손대면서 기능을 추가하도록 구조를 변경한다.
 * v07 => 연산자 처리를 static 함수를 이용하여 수행한다.
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
