/* 컴파일과 실행
=> 컴파일
   app.c (소스)
   --컴파일러--> app.obj(기계어)
               --링커--> app.obj + *.obj + *.lib + loader = app.exe
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	puts("Hello, World!");
	return EXIT_SUCCESS;
}
