/* getc(), putc() - 파일 객체로부터 한 개의 문자를 읽고 쓰기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main67(void) {
	int ch;

	// stdin - 표준 입력 장치(키보드)의 FILE*
	// stdout - 표준 출력 장치(콘솔)의 FILE*
	while ((ch = getc(stdin)) != EOF) { // EOF(End of File) => Ctrl + z 키를 눌렀을 때!
		putc(ch, stdout);
	}

	printf("stop program!\n");
	return EXIT_SUCCESS;
}







