/* ¹Ýº¹¹® - break
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {

	for (int i = 2; i < 10; i++) {
		for (int j = 1; j < 10; j++) {
			printf("%d * %d = %d\n", i, j, i * j);
		}
		printf("\n");
	}

	return EXIT_SUCCESS;
}







