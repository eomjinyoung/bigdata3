/* getchar(), putchar() - 키보드 입력 받기
 * => 한 문자를 입력 받고 한 문자를 출력할 때 사용한다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main66(void) {
	int ch;

	while ((ch = getchar()) != EOF) { // EOF(End of File) => Ctrl + z 키를 눌렀을 때!
		putchar(ch);
	}

	printf("stop program!\n");
	printf("%d\n", EOF);
	return EXIT_SUCCESS;
}







