/* 계산을 수행할 함수를 모아둔 파일
 */

#include <stdio.h>

// app.c에서 선언한 글로벌 변수를 참조
extern int a, b;
extern char op;
extern float result;

void compute() {
	switch (op) {
	case '+': result = a + b; break;
	case '-': result = a - b; break;
	case '*': result = a * b; break;
	case '/': result = a / (float)b; break;
	case '%': result = a % b; break;
	default:
		printf("'%c' 연산자는 지원하지 않습니다.", op);
	}
}





