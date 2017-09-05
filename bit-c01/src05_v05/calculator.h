/* calculator.c에 정의된 함수의 프로토타입을 선언한다.
 */

#ifndef CALCULATOR_H_
#define CALCULATOR_H_

typedef struct expr {
	int a;
	int b;
	char op;
	float result;
} Expr, *PExpr;

void compute();

#endif /* CALCULATOR_H_ */
