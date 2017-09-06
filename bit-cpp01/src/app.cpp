/* [네임스페이스]
 * 방법1:
 *   - 클래스나 함수를 사용할 때 네임스페이스를 지정해야 한다.
 *     예) 네임스페이스::객체, 네임스페이스::클래스, 네임스페이스::함수, ...
 * 방법2:
 *   - 네임스페이스에서 사용할 클래스, 객체, 함수를 지정하기.
 *     미리 사용할 멤버에 대해 네임스페이스 정보를 지정해 두면 네임스페이스 이름 없이 사용할 수 있다.
 *     예) using 네임스페이스::멤버명;
 *         멤버...
 * 방법3:
 *   - 네임스페이스 전체를 사용하겠다고 지정하기.
 *     예) using namespace 네임스페이스;
 *         멤버...
 *
 * [헤더 파일 인클루드]
 * 방법1:
 *   #include <iostream.h> // 시스템 라이브러리
 *   #include "myheader.h" // 개발자가 추가한 헤더
 *   #include "other/myheader.h" // 하위 폴더에 있다면, 폴더명을 지정한다.
 * 방법2:
 *   #include <iostream> // C++에서는 .h를 생략하는 것이 관례다.
 *                       // 이유? c 헤더 파일과 구분하기 위해서이다.
 * 방법3:
 *   #include <cmath>  // c로 시작하는 헤더파일명은 c에서 제공하던 라이브러리를
 *                     // c++에 맞춰 재제작한 것을 의미한다.
 *                     // math.h(c) + 추가코드 ===> cmath.h(c++)
 *
 *
 * [c++ 파일명 규칙]
 * - 소스파일 : xxxx.cpp, xxxx.cc
 * - 헤더파일 : xxxx.hpp, xxxx.h
 *
 *
 *
 *
 */
#include <iostream>
using namespace std;

int main() {
	cout << "Hello World!3" << endl;
	return 0;
}




