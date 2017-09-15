# 모듈 사용하기 - 모듈의 모든 함수 가져오기

# calculator.py 파일에 있는 모든 함수를 사용하겠다고 선언!
# => from 모듈명 import *
from calculator import *

# 다음과 같이 모듈명 없이 사용할 수 있다.
print(plus(10, 20))
print(minus(10, 20))
print(multiple(10, 20))
print(divide(10, 20))