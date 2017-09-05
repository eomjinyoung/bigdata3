/* 계산을 수행할 함수를 모아둔 파일
 */

#include <stdio.h>
#include "calculator.h"

static float plus(int, int);
static float minus(int, int);
static float multiple(int, int);
static float divide(int, int);
static float mod(int, int);

void compute(PExpr pExpr) {
	switch (pExpr->op) {
	case '+': pExpr->result = plus(pExpr->a, pExpr->b); break;
	case '-': pExpr->result = minus(pExpr->a, pExpr->b); break;
	case '*': pExpr->result = multiple(pExpr->a, pExpr->b); break;
	case '/': pExpr->result = divide(pExpr->a, pExpr->b); break;
	case '%': pExpr->result = mod(pExpr->a, pExpr->b); break;
	default:
		printf("'%c' 연산자는 지원하지 않습니다.", pExpr->op);
	}
}

// 다음 함수들은 이 모듈 안에서만 사용할 것이기 때문에 static을 붙여 외부의 접근을 막는다.
static float plus(int a, int b) {return a + b;}
static float minus(int a, int b) {return a - b;}
static float multiple(int a, int b) {return a * b;}
static float divide(int a, int b) {return a / (float)b;}
static float mod(int a, int b) {return a % b;}



