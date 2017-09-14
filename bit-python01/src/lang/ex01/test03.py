# 값을 표현하는 방법

# 문자열 표현
print("Hello")
print('Hello')
print("Hello,\tworld!")
print("Hello,\nworld!")

# 문자열 형식 정의
print("Hello, {name}")

name = "홍길동"
print(f"Hello, {name}")

age = 20
print(f"{name} 나이 = {age}")

# 정수값 표현
print(10)       # 10진수
print(0b1011)   # 2진수
print(0B1011)   # 2진수
print(0o17) # 8진수 = 1 * 8**1 + 7 * 8**0
print(0O17)
print(0x17) # 16진수
print(0X17)

# 정수값의 자릿수 표현
print(123_456) # _의 위치는 자유롭다
print(12_3456)
print(0b0110_0001) # 97

# 부동 소수점값 표현
















