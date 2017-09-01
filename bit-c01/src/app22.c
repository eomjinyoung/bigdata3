/* 포인터 - 동적 메모리 해제
 * => malloc()으로 힙에 생성한 메모리는
 *    사용한 후에 개발자가 명시적으로 해제시키지 않으면
 *    프로그램이 종료될 때까지 계속 메모리에 남아 있는다.
 *    만약 그 프로그램이 24시간 365일 내내 실행되는 프로그램이라면,
 *    약간 메모리 누수도 시스템에 치명적인 문제를 일으킬 수 있다.
 * => 해결책?
 *    - malloc()을 생성한 메모리를 항상 쓰고 난 다음에 free()를 사용하여 해제시켜라!
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app22_f1() {
	// 동적 메모리를 준비한다.
	char* p = (char*) malloc(100000000);

	// 동적 메모리를 사용한다.
	// => 여기 동적 메모리에 파일을 읽어 들이는 코드가 있다고 가정하자!
	// ...
	memset(p, 'a', 100000000);

	// => 동적 메모리에 저장된 데이터를 처리한 후 그 결과를 result에 저장했다고 가정하자!
	int result = 1;

	// malloc()으로 힙에 생성한 메모리를 해제시키기
	free(p); //메모리의 주소를 전달하면 된다.

	// 작업 결과를 리턴한다.
	return result;
}

int main22(void) {

	char str[10];

	// 이제 필요할 때마다 app22_f1()을 호출하여 작업을 수행하는 것을 표현해보겠다.
	while (1) {
		printf("result=%d\n", app22_f1());

		puts("quit?(y/n)");
		scanf("%s", str);
		if (strcmp(str, "y") == 0)
			break;
	}

	return EXIT_SUCCESS;
}










