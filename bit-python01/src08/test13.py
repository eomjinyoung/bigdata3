# 클래스 사용하기 - 인스턴스끼리 더하고 빼기
# - 연산자 오버로딩 이용하기

# => from 패키지명.모듈명 import 클래스명
from ex04.calculator7 import Calculator

# => 클래스의 인스턴스 생성
c1 = Calculator()
c2 = Calculator()

# 인스턴스 메서드를 호출할 때는 반드시 인스턴스 주소로 호출해야 한다.
c1.plus(20) 
c2.plus(10)
c1.multiple(4)
c2.divide(2)

c3 = c1 + c2 # 내부적으로 __add__() 메서드가 호출된다. 
# 즉 위의 명령은 다음과 같다
#c3 = c1.__add__(c2)

c4 = c1 - c2 # 내부적으로 __sub__() 메서드가 호출된다.

print(f"c1.result={c1.result}")
print(f"c2.result={c2.result}")
print(f"c3.result={c3.result}")
print(f"c4.result={c4.result}")








