/* 조건문 - switch
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main39(void) {
	int level = 10;

	switch (level) {
	case 0: printf("손님\n"); break;
	case 1: printf("회원\n"); break;
	case 2: printf("관리자\n"); break;
	default: printf("유효하지 않은 등급입니다.\n");
	}

	return EXIT_SUCCESS;
}







