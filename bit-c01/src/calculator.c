/* 계산을 수행할 함수를 모아둔 파일
 */

#include <stdio.h>
#include "calculator.h"

// app.c에서 선언한 글로벌 변수를 참조
extern Expr exprVal;

void compute() {
	switch (exprVal.op) {
	case '+': exprVal.result = exprVal.a + exprVal.b; break;
	case '-': exprVal.result = exprVal.a - exprVal.b; break;
	case '*': exprVal.result = exprVal.a * exprVal.b; break;
	case '/': exprVal.result = exprVal.a / (float)exprVal.b; break;
	case '%': exprVal.result = exprVal.a % exprVal.b; break;
	default:
		printf("'%c' 연산자는 지원하지 않습니다.", exprVal.op);
	}
}





