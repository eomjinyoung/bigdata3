/* 반복문 - break와 continue
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main45(void) {

	for (int i = 2; i < 10; i++) {
		if (i == 5)
			continue; // 다음 문장을 실행하지 않고 for의 증가/감소 문으로 보낸다.
		for (int j = 1; j < 10; j++) {
			if ((i * j) > 50)
				break; // 현재 블록을 나간다.
			printf("%d * %d = %d\n", i, j, i * j);
		}
		printf("\n");
	}

	return EXIT_SUCCESS;
}







