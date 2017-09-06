/* 네임스페이스 정의 II
 * - 하위 네임스페이스 정의하기
 */
#include <iostream>
using namespace std;

namespace a {
	void f1() {
		cout << "a::f1()...\n";
	}
	namespace b {
		void f1() { // 네임스페이스가 다르면 같은 이름을 가진 함수를 만들어도 오류가 아니다.
			cout << "a::b::f1()..." << endl;
		}
		void f2() {
			cout << "a::b::f2()..." << endl; // cout.operator<<("f2()...")
		}
	}
}


int main() {
	a::f1();
	a::b::f1();
	a::b::f2();

	using namespace a; // 상위 네임스페이스를 사용하겠다고 해서, 하위 네임스페이스까지 사용할 수 있는 것은 아니다.
	f1();
	//f2(); // 컴파일 오류! 하위 네임스페이스의 함수를 사용하려면 따로 using을 선언해야 한다.
	b::f2(); // 이렇게 하위 네임스페이스 이름을 지정해야 한다.

	using namespace a::b;
	//f1(); // 컴파일 오류! a 에도 같은 이름의 함수가 있기 때문에 어떤 함수인지 알 수 없어서 오류!
	a::f1();
	a::b::f1();
	b::f1(); // a 네임스페이스가 지정되어 있기 때문에 하위 네임스페이스를 바로 지정할 수 있다.
	f2();

	return 0;
}




