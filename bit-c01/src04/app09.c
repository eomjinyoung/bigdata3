/* 변수와 데이터형 - 함수를 이용하여 문자열 다루기
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main09(void) {
	char str[] = "Hello, world!";

	// strlen(배열주소) : 문자열의 길이를 리턴한다.
	printf("%s(%d)\n", str, strlen(str)); // 문자열의 길이.
	printf("%s(%d)\n", str, sizeof(str)); // 배열 자체의 크기. *sizeof는 명령어이다. 함수가 아니다!

	// strcpy(target, source) : 스트링 전체 복사. 소스에 있는 문자열을 타겟 메모리에 복사한다.
	char str2[strlen(str) + 1]; // 복사한 문자열을 저장할 배열의 크기는 항상 "문자열 개수 + 1" 이어야 한다.
				  // 즉 최소한 복사해오는 문자열 보다 저장소가 커야 한다.
	strcpy(str2, str);
	printf("%s(%d;%d)\n", str2, strlen(str2), sizeof(str2));

	// strcat(target, source) : source 문자열을 target 문자열 끝에 붙인다.
	// => 따라서 target 문자열을 보관하는 메모리는 source를 저장할 수 있을 만큼 여유 공간이 있어야 한다.
	char str3[50];
	char str4[] = "Hello, ";
	char str5[] = "world!";

	str3[0] = 0; // 배열의 시작 위치에 0을 넣어 배열에 문자열이 들어 있지 않음을 표시한다.
	strcat(str3, str4); // str4를 str3 배열에 붙인다.
	printf("%s(%d/%d)\n", str3, strlen(str3), sizeof(str3));

	strcat(str3, str5); // str5를 str3 문자열 끝에 붙인다.
	                    // 즉 str3 배열에서 0이 들어 있는 방을 찾아서 그 방부터 문자열을 붙인다.
	printf("%s(%d/%d)\n", str3, strlen(str3), sizeof(str3));

	// strcmp(str1, str2) : 두 개의 문자열을 비교하여 그 결과를 리턴한다.
	// => 같으면 0, str1이 str2 보다 순서상 이전 문자열이면 음수 이후 문자열이면 양수
	char str11[] = "aaa";
	char str12[] = "aaaa";
	char str13[] = "aab";
	char str14[] = "aaa";

	printf("%d, %d, %d, %d\n",
			strcmp(str11, str14), // = 0
			strcmp(str11, str12), // < 0
			strcmp(str11, str13), // < 0
			strcmp(str13, str11)  // > 0
			);

	// memset(메모리, 값, 개수) : 지정된 메모리를 값으로 초기화시킨다.
	// => 보통 배열을 초기화시킬 때 많이 사용한다.
	char str20[10]; // 배열을 만든 후 초기화시키지 않고 사용하면 기존의 값이 설정된 경우를 볼 수 있다.
	                // 따라서 가능한 배열을 사용 전에 0으로 초기화시킨 후 사용하라!
	for (int i = 0; i < sizeof(str20); i++) {
		printf("%d ", str20[i]);
	}
	printf("\n");

	// => 배열을 초기화시키기!
	memset(str20, 0, sizeof(str20));
	for (int i = 0; i < sizeof(str20); i++) {
		printf("%d ", str20[i]);
	}

	return EXIT_SUCCESS;
}



