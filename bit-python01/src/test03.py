# 모듈 사용하기 - 함수에 별명 붙이기

# => from 모듈명 import 함수명 as 별명
from calculator import plus as p, minus
 
# => 별명이 붙은 함수는 별명으로 호출해야 한다. 
print(p(10, 20))

# => 별명이 붙은 함수는 원래 이름으로 호출할 수 없다.
#print(plus(10, 20)) # 오류!

# => 별명이 붙지 않은 함수는 원래 이름으로 호출한다.
print(minus(10, 20))
