# 클래스 사용하기 - 클래스의 스태틱 메서드 호출하기

# => from 패키지명.모듈명 import 클래스명
from ex04.calculator4 import Calculator

print(Calculator.plus(10, 20))
print(Calculator.minus(10, 20))
print(Calculator.multiple(10, 20))
print(Calculator.divide(10, 20))

# 함수와 메서드?
#
# 함수
# => 모듈에 바로 선언된 경우 함수라고 부른다.
#
# 메서드
# => 클래스에 선언된 경우 메서드라 부른다.
#
# 메서드의 종류
# => 스태틱 메서드
#    - 클래스 변수나 인스턴스 변수를 사용하지 않는 경우. 
#    - 메서드를 관리하기 좋게 클래스에 묶어 두는 용도
#  
# => 클래스 메서드
#    - 클래스 변수를 사용하는 메서드
#
# => 인스턴스 메서드
#    - 인스턴스 변수를 사용하는 메서드 





