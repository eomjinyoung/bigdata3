/* scanf() - 키보드 입력 받기
 * => scanf(포맷문자열, 값을 받을 메모리의 주소, ...);
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main63(void) {
	char name[50];
	int age;

	printf("name: ");
	scanf("%s", name);

	printf("age: ");
	scanf("%d", &age);

	printf("%s, %d\n", name, age);

	return EXIT_SUCCESS;
}







