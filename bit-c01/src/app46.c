/* 반복문 - goto
 * => 프로그램의 실행 흐름을 파악하기 어렵게 만든다.
 *    가능한 사용하지 말라!
 * => 그러나 여러 중첩문을 빠져 나갈 때 유용하다!
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main46(void) {

	for (int i = 2; i < 10; i++) {
		if (i == 5)
			continue; // 다음 문장을 실행하지 않고 for의 증가/감소 문으로 보낸다.
		for (int j = 1; j < 10; j++) {
			if ((i * j) > 50)
				goto haha; // 모든 반복문을 빠져나간다.
			printf("%d * %d = %d\n", i, j, i * j);
		}
		printf("\n");
	}

	haha:

	printf("프로그램 종료!\n");

	return EXIT_SUCCESS;
}







