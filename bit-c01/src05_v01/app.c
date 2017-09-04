/* ver01
 * => 사용자로부터 식을 입력 받는다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(void) {
	int a, b;
	char op;

	printf("input: ");
	scanf("%d %c %d", &a, &op, &b);

	printf("%d, %c, %d\n", a, op, b);

	return EXIT_SUCCESS;
}







