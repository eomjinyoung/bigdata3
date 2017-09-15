# 패키지 사용하기 - 패키지의 모듈을 가져오기

# => import 패키지명.모듈명
import ex03.calculator2 

# => 함수를 호출할 때,
#    패키지명 + 모듈명 + 함수명을 모두 적어야 한다.
print(ex03.calculator2.plus(10, 20))
print(ex03.calculator2.minus(10, 20))
print(ex03.calculator2.multiple(10, 20))
print(ex03.calculator2.divide(10, 20))

# 다음과 같이 패키지 명을 생략하면 오류가 발생한다.
#print(calculator2.plus(10, 20))