/* 변수와 데이터형 - 배열
 * => 같은 타입의 메모리를 여러 개 만들 때 사용한다.
 */

#include <stdio.h>
#include <stdlib.h>

int main07(void) {
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

	return EXIT_SUCCESS;
}



