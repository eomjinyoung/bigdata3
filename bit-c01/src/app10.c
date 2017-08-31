/* 변수와 데이터형 - 형변환
 * => (변환하고자하는 데이터형) 변수;
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main10(void) {
	// 형변환 적용 전
	int a = 5, b = 2;
	float r = a / b; // 정수와 정수의 연산 결과는 정수이다.
	printf("%f\n", r);

	// 명시적 형변환
	r = (float) a / (float) b;
	printf("%f\n", r);

	// 암시적 형변환
	// => CPU는 부동소수점을 처리하는 회로와 정수를 처리를 회로가 다르다.
	//    그래서 부동소수점과 정수를 함께 연산할 수 없다.
	// => 부동소수점과 정수를 연산하려면 두 개를 같은 타입으로 만들어야지
	//    같은 회로를 타고 연산을 수행할 수 있다.
	r = a / (float) b;
	printf("%f\n", r);

	r = (float) a / b;
	printf("%f\n", r);

	return EXIT_SUCCESS;
}









