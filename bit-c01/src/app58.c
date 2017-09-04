/* 구조체 - union
 * => 다양한 타입의 멤버를 한 개만 유지하고 싶을 때 사용한다.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main58(void) {

	// union 적용 전
	char name[20];
	int age;

	// 다음 세 변수는 저장하려는 데이터에 따라 사용여부가 결정된다.
	// => 그럼에도 불구하고 일단 다음 세 개의 변수를 모두 준비해야 한다.
	int grade;
	float score;
	char working;

	// 학생 정보를 저장
	strcpy(name, "홍길동");
	age = 20;
	grade = 4;
	printf("%s, %d, %d\n", name, age, grade);

	// 졸업생 정보를 저장
	strcpy(name, "임꺽정");
	age = 30;
	score = 3.7;
	printf("%s, %d, %f\n", name, age, score);

	// 직장인 정보를 저장
	strcpy(name, "유관순");
	age = 22;
	working = 'Y';
	printf("%s, %d, %c\n", name, age, working);

	return EXIT_SUCCESS;
}







