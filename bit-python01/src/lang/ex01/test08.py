# 컬렉션 - 리스트 II
import time
print("1 ---------------------------------")

# 숫자 리스트 만들기
numScope = range(5) # 숫자의 범위를 정의한다.
arr = list(numScope) # 그 범위의 숫자를 리스트로 만든다. 
print(arr)
print(list(range(5))) # 0부터 5 전까지

print(list(range(2, 5))) # 2부터 5 전까지

print(list(range(0, 10, 2))) # 0부터 2씩 증가하면서 10 전까지

print("2 ---------------------------------")

# 리스트 관련 간단한 계산 함수
arr = list(range(1, 11)) # 1 ~ 10

print(sum(arr))
print(min(arr))
print(max(arr))

print("3 ---------------------------------")

# for 문을 이용한 리스트 생성 방법
arr = [value for value in range(1, 11)]
print(arr)

arr = [value ** 2 for value in range(1, 11)]
print(arr)

arr = [value * 10 for value in range(1, 11)]
print(arr)











