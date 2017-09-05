/* 계산을 수행할 함수를 모아둔 파일
 */

#include <stdio.h>
#include "calculator.h"

void compute(PExpr pExpr) {
	switch (pExpr->op) {
	case '+': pExpr->result = pExpr->a + pExpr->b; break;
	case '-': pExpr->result = pExpr->a - pExpr->b; break;
	case '*': pExpr->result = pExpr->a * pExpr->b; break;
	case '/': pExpr->result = pExpr->a / (float)pExpr->b; break;
	case '%': pExpr->result = pExpr->a % pExpr->b; break;
	default:
		printf("'%c' 연산자는 지원하지 않습니다.", pExpr->op);
	}
}





