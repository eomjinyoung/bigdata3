/* 변수와 데이터형 - 배열
 * => 같은 타입의 메모리를 여러 개 만들 때 사용한다.
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int scores[5];
	int a = 100;

	scores[0] = 100;
	scores[1] = 90;
	scores[2] = 80;
	scores[3] = 70;
	scores[4] = 60;

	printf("%d, %d, %d, %d, %d\n",
			scores[0], scores[1], scores[2], scores[3], scores[4]);

	// 배열의 크기를 벗어나면?
	// => 컴파일 OK.
	// => 실행도 때론 OK! 이게 문제다!
	//    메모리의 허용 범위를 벗어나도 엄격하게 처리하지 않는다.
	//
	scores[5] = 50; // 원래 이 코드는 문제가 되어야 한다. 절대 이렇게 코딩하지 말라!
	printf("%d\n", scores[5]);

	printf("%d\n", a);

	// 배열 선언과 동시에 초기화시키기
	int scores2[3] = {100, 90, 80};
	int len = sizeof(scores2) / sizeof(int);
	for (int i = 0; i < len; i++) {
		printf("%d, ", scores2[i]);
	}
	printf("\n");

	// => 배열 선언과 동시에 값을 초기화시킬 때는 배열의 개수를 생략해도 된다.
	//    그러면 값의 개수에 따라 배열의 개수가 결정된다.
	int scores3[] = {100, 90, 80};
	len = sizeof(scores3) / sizeof(int);
	for (int i = 0; i < len; i++) {
		printf("%d, ", scores3[i]);
	}
	printf("\n");

	return EXIT_SUCCESS;
}



