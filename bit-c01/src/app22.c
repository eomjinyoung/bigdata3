/* 포인터 - 동적 메모리 해제
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app22_f1() {
	// 동적 메모리를 준비한다.
	char* p = (char*) malloc(1000000);

	// 동적 메모리를 사용한다.
	// => 여기 동적 메모리에 파일을 읽어 들이는 코드가 있다고 가정하자!
	// ...

	// => 동적 메모리에 저장된 데이터를 처리한 후 그 결과를 result에 저장했다고 가정하자!
	int result = 1;

	// 작업 결과를 리턴한다.
	return result;
}

int main(void) {

	// 이제 필요할 때마다 app22_f1()을 호출하여 작업을 수행하는 것을 표현해보겠다.
	printf("작업결과=%d\n", app22_f1());
	printf("작업결과=%d\n", app22_f1());
	printf("작업결과=%d\n", app22_f1());
	printf("작업결과=%d\n", app22_f1());
	printf("작업결과=%d\n", app22_f1());
	printf("작업결과=%d\n", app22_f1());

	return EXIT_SUCCESS;
}










