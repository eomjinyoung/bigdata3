/* gets(), puts() - 표준 입출력 장치로부터 문자열을 읽고 쓰기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main68(void) {
	char message[100];

	gets(message);
	puts(message);

	return EXIT_SUCCESS;
}







