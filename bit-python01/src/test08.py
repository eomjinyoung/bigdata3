# 패키지 사용하기 - 패키지명과 모듈명 생략하는 방법

# => from 패키지명 import 모듈명
from ex03.calculator2 import *  

# => from에 적시한 패키지명 및 모듈명은 생략한다.
print(plus(10, 20))
print(minus(10, 20))
print(multiple(10, 20))
print(divide(10, 20))

# 모듈명을 적으면 오히려 오류가 발생한다.
#print(calculator2.plus(10, 20))