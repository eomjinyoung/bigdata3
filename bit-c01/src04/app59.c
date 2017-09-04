/* 구조체 - union II
 * => 다양한 타입의 멤버를 한 개만 유지하고 싶을 때 사용한다.
 * => 한 개의 메모리를 만들어 놓고 다양한 이름의 변수로 사용하는 문법이다.
 * => 한 개의 메모리를 만들어 다양한 타입의 데이터를 저장하는데 사용할 수 있어서 메모리가 절약된다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main59(void) {

	// union 적용 후
	char name[20];
	int age;

	// 다음 세 변수를 한 타입으로 정의한다.
	/*
	int grade;
	float score;
	char working;
    */
	union option {
		int grade;  	// 메모리 크기 : 4 바이트
		float score;  	// 메모리 크기 : 4 바이트
		char working;  	// 메모리 크기 : 1 바이트
	};

	// 유니온 변수 선언
	// => 메모리는 유니온에 선언된 여러 변수 중에서 가장 큰 변수의 크기로 결정된다.
	union option opt;
	printf("유니온 타입의 크기=%d\n", sizeof(union option));

	// 학생 정보를 저장
	strcpy(name, "홍길동");
	age = 20;
	opt.grade = 4;
	printf("%s, %d, %d\n", name, age, opt.grade);

	// 졸업생 정보를 저장
	strcpy(name, "임꺽정");
	age = 30;
	opt.score = 3.7;
	printf("%s, %d, %f\n", name, age, opt.score);

	// 직장인 정보를 저장
	strcpy(name, "유관순");
	age = 22;
	opt.working = 'Y';
	printf("%s, %d, %c\n", name, age, opt.working);

	return EXIT_SUCCESS;
}







