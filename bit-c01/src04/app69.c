/* printf(), sprintf() - 형식이 있는 문자열을 출력
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main69(void) {
	char name[20];
	int age = 20;
	char message[100];

	strcpy(name, "홍길동");

	printf("%s(%d)님 반갑습니다.\n", name, age); // 표준 출력 장치로 출력한다.

	sprintf(message, "%s(%d)님 반갑습니다.\n", name, age); // 메모리로 출력한다.
	puts(message);


	return EXIT_SUCCESS;
}







