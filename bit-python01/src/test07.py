# 패키지 사용하기 - 함수를 호출할 때 패키지명을 생략하는 방법

# => from 패키지명 import 모듈명
from ex03 import calculator2 

# => from에 적시한 패키지명은 생략한다.
print(calculator2.plus(10, 20))
print(calculator2.minus(10, 20))
print(calculator2.multiple(10, 20))
print(calculator2.divide(10, 20))

# 패키지명을 적으면 오히려 오류가 발생한다.
#print(ex03.calculator2.plus(10, 20))