/* 구조체 - union III
 * => 구조체와 유니온
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct member {
	char name[50];
	int age;
	union option {
		int grade;
		float score;
		char working;
	} opt;
} Member, *PMember;

int main(void) {

	printf("struct member의 크기=%d\n", sizeof(Member));

	// 학생 정보를 저장
	Member m1;
	strcpy(m1.name, "홍길동");
	m1.age = 20;
	m1.opt.grade = 4;
	printf("%s, %d, %d\n", m1.name, m1.age, m1.opt.grade);

	// 졸업생 정보를 저장
	Member m2;
	strcpy(m2.name, "임꺽정");
	m2.age = 30;
	m2.opt.score = 3.7;
	printf("%s, %d, %f\n", m2.name, m2.age, m2.opt.score);

	// 직장인 정보를 저장
	Member m3;
	strcpy(m3.name, "유관순");
	m3.age = 22;
	m3.opt.working = 'Y';
	printf("%s, %d, %c\n", m3.name, m3.age, m3.opt.working);

	return EXIT_SUCCESS;
}







