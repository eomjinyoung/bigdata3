# 모듈 사용하기 - 모듈의 일부 함수만 가져오기

# calculator.py 모듈의 plus(), minus()를 사용하겠다고 선언!
# => from 모듈명 import 함수명
from calculator import plus, minus
 
# 함수 호출하기
# => import에서 함수명을 명시하면 
#    호출할 때 모듈명을 적을 필요가 없다.
print(plus(10, 20))
print(minus(10, 20))

# 다음 함수는 import 하지 않았기 때문에 오류!
#print(multiple(10, 20))
#print(divide(10, 20))