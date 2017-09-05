/* 계산을 수행할 함수를 모아둔 파일
 */

#include <stdio.h>
#include "calculator.h"

static float plus(int, int);
static float minus(int, int);
static float multiple(int, int);
static float divide(int, int);
static float mod(int, int);

typedef float (*Func)(int, int); // Func는 변수가 아니라 타입이다.

// 연산자와 그 연산을 처리하는 함수의 연결 정보를 저장할 구조체를 정의한다.
typedef struct op_func_map {
	char op;
	Func func;
} OpFuncMap, *POpFuncMap;

static OpFuncMap opMap[] = {
		{'+', plus},
		{'-', minus},
		{'*', multiple},
		{'/', divide},
		{'%', mod}
};


void compute(PExpr pExpr) {
	int mapSize = sizeof(opMap) / sizeof(OpFuncMap); // 배열의 크기를 계산한다.

	Func func = 0; // 연산을 수행할 함수 주소를 담을 변수

	for (int i = 0; i < mapSize; i++) { // 맵에서 지정된 연산을 수행할 함수를 찾는다.
		if (pExpr->op == opMap[i].op) { // 찾았으면 func 변수에 해당 함수의 주소를 저장한다.
			func = opMap[i].func;
			break; // 찾았으면 반복문을 나간다.
		}
	}

	if (func == 0) { // 해당 연산자를 처리할 함수를 찾지 못했다면,
		printf("'%c' 연산자는 지원하지 않습니다.", pExpr->op);
		return;
	}

	// 함수를 호출하여 계산을 수행한 후 그 결과를 메모리에 담는다.
	pExpr->result = func(pExpr->a, pExpr->b);

}

// 다음 함수들은 이 모듈 안에서만 사용할 것이기 때문에 static을 붙여 외부의 접근을 막는다.
static float plus(int a, int b) {return a + b;}
static float minus(int a, int b) {return a - b;}
static float multiple(int a, int b) {return a * b;}
static float divide(int a, int b) {return a / (float)b;}
static float mod(int a, int b) {return a % b;}



