/* v03 => 코드를 함수로 쪼갠다.
 * v02 => 입력 받은 식을 계산하여 결과를 출력한다.
 * v01 => 사용자로부터 식을 입력 받는다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 함수 프로토타입 선언
void prompt(char *);
void compute();
void displayResult();

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

void prompt(char *message) {
	printf(message);
	scanf("%d %c %d", &a, &op, &b);
}

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

void displayResult() {
	puts("---------------------------");
	printf("| %d %c %d = %.2f\n", a, op, b, result);
	puts("---------------------------");
}





