# 클래스 사용하기 - 클래스 변수 및 클래스 메서드 호출하기

# => from 패키지명.모듈명 import 클래스명
from ex04.calculator6 import Calculator

# => 클래스의 인스턴스 생성
c1 = Calculator()
c2 = Calculator()

# 인스턴스 메서드를 호출할 때는 반드시 인스턴스 주소로 호출해야 한다.
c1.plus(20) 
c2.plus(10)
c1.multiple(4)
c2.divide(2)

print(f"c1.result={c1.result}")
print(f"c2.result={c2.result}")





