/* scanf(), sscanf() - 형식에 따른 문자열 입력
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main70(void) {
	char name[20];
	int age = 20;
	char message[] = "hongkildong 30";

	scanf("%s %d", name, &age);// 키보드로부터 형식이 있는 문자열을 입력 받아서 변수에 저장한다.
	printf("=> %s(%d)\n", name, age);

	sscanf(message, "%s %d", name, &age);// 메모리로부터 형식이 있는 문자열을 입력 받아서 변수에 저장한다.
	printf("=> %s(%d)\n", name, age);

	return EXIT_SUCCESS;
}







