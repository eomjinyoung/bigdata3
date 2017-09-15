# 클래스 사용하기 - 클래스 변수 및 클래스 메서드 호출하기

# => from 패키지명.모듈명 import 클래스명
from ex04.calculator5 import Calculator

Calculator.plus(20) # 계산 결과는 Calculator 클래스의 result 변수에 쌓인다.
Calculator.minus(10)
Calculator.multiple(4)
Calculator.divide(2)
print(Calculator.result)
