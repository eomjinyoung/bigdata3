/* 조건문 - if ~ else if ~ else if ~ else
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main37(void) {
	int age = 18;

	if (age < 8)
		printf("아동\n");
	else if (age >= 8 && age < 14)
		printf("어린이\n");
	else if (age >= 14 && age < 19)
		printf("청소년\n");
	else
		printf("성년\n");

	return EXIT_SUCCESS;
}







