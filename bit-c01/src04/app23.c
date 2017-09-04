/* 함수 - 함수 정의
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 1) 리턴 값이 없을 경우 void를 지정해야 한다.
void app23_f1() {
	puts("f1()...");
}

// 2) 예전에는 리턴 값이 없으면 리턴 타입을 지정하지 않아도 되었다!
// => 그러나 현대에 와서는 리턴 값이 없으면 void를 선언하는 것이 보통이다.
app23_f2() {
	puts("f2()...");
}

// 3) 파라미터가 있는 함수
void app23_f3(char* name, int age) {
	// %s : 문자열이 들어 있는 메모리의 주소를 줘야 한다.
	//      문자열의 끝을 인식 할 수 있도록 문자열의 끝은 반드시 null로 끝나야 한다.
	// %d : 정수 값을 10진수로 출력한다. 그냥 정수 변수를 지정하면 된다.
	printf("%s(%d)님 환영합니다!\n", name, age);
}

// 4) 값을 리턴하는 함수
//    => 리턴한 값의 타입을 지정해야 한다.
char* app23_f4() {
	char *buf = (char*) malloc(100);
	strcpy(buf, "Hello");
	return buf; // 값을 리턴할 때는 return 명령을 사용한다.
}

// 5) 주소를 아규먼트로 받는 함수
void app23_f5(char* buf) {
	strcpy(buf, "Hello2");
}

// 6) 아규먼트를 받아서 계산한 후 결과를 리턴하는 함수
int app23_f6(int a, int b) {
	return a + b; // 값을 리턴할 때는 return 명령을 사용한다.
}

int main23(void) {
	app23_f1();
	app23_f2();
	app23_f3("홍길동", 24);

	char* buf = app23_f4();
	printf("%s\n", buf);
	free(buf);

	char buf2[100];
	app23_f5(buf2);
	printf("%s\n", buf2);

	printf("%d\n", app23_f6(20, 30));

	return EXIT_SUCCESS;
}










