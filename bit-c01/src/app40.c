/* 조건문 - switch II
 * => break 문이 없으면 계속 다음 case 문장을 실행한다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main40(void) {
	int level = 1;

	switch (level) {
	case 0: printf("손님\n");
	case 1: printf("회원\n");
	case 2: printf("관리자\n");
	default: printf("유효하지 않은 등급입니다.\n");
	}

	return EXIT_SUCCESS;
}







