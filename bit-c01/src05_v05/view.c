/* 화면 출력에 관련된 코드를 이 파일에 둔다.
 */

#include <stdio.h>
#include "calculator.h"

// app.c에 선언된 글로벌 변수를 사용하겠다고 선언한다.
// 어느 파일에 선언됐는지 지정할 필요는 없다. 다른 파일에 선언된 글로벌 변수를 찾기 때문이다.
extern Expr exprVal;

void prompt(char *message) {
	printf(message);
	scanf("%d %c %d", &exprVal.a, &exprVal.op, &exprVal.b);
}

void displayResult() {
	puts("---------------------------");
	printf("| %d %c %d = %.2f\n", exprVal.a, exprVal.op, exprVal.b, exprVal.result);
	puts("---------------------------");
}





