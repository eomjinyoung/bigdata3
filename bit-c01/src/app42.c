/* ¹Ýº¹¹® - do ~ while
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	int count = 0;

	do {
		printf("%d,", count++);
	} while (count < 10);

	return EXIT_SUCCESS;
}







