/* ver02
 * => 사용자로부터 식을 입력 받는다.
 * => 입력 받은 식을 계산하여 결과를 출력한다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(void) {
	int a, b;
	char op;
	float result;

	printf("input: ");
	scanf("%d %c %d", &a, &op, &b);

	switch (op) {
	case '+': result = a + b; break;
	case '-': result = a - b; break;
	case '*': result = a * b; break;
	case '/': result = a / (float)b; break;
	case '%': result = a % b; break;
	default:
		printf("'%c' 연산자는 지원하지 않습니다.");
	}
	printf("result: %f\n", result);

	return EXIT_SUCCESS;
}







