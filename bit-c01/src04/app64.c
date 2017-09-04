/* scanf() - 키보드 입력 받기 II
 * => scanf(포맷문자열, 값을 받을 메모리의 주소, ...);
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main64(void) {
	char name[50];
	int age;

	printf("name age?");
	scanf("%s %d", name, &age);

	printf("%s, %d\n", name, age);

	return EXIT_SUCCESS;
}







