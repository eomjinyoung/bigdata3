/* v06 => 구조체 포인터를 이용하여 입력 값과 결과 값을 다룬다.
 *        - 글로벌 변수를 공유하게 되면 그 변수에 종속된다.
 *        - 다른 글로벌 변수를 사용할 수 없는 문제가 발생한다.
 *        - 이런 문제를 해결하기 위해 글로벌 변수를 공유하기 보다는
 *          변수를 만들어 함수를 호출할 때 그 주소를 전달하는 방식이
 *          소스 코드를 재사용하기 쉽게 만든다.
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
