# 연산자

# 산술 연산자
print(10 + 20)
print(10 - 20)
print(10 * 20)
print(10 / 20) # 정확하게 소수점 이하의 값이 출력된다. 자바나 C/C++과 다르다.
print(10 // 20) # 소수점 이하 버린다.
print(10 % 7)
print(2**3) # 제곱승 연산자
print("----------------")

# 비교 연산자
print(10 == 20)
print(10 != 20)
print(10 < 20)
print(10 <= 20)
print(10 > 20)
print(10 >= 20)
print("---------------------")


# 할당 연산자
a = 20
print(a)

a = a + 2
print(a)

a += 2
print(a)

print("-------------------")

# 논리 연산자
print(True and False)
print(True or False)
print(not True)

print("-----------------------")

# 비트 연산자
print(0b0110 & 0b0101) # and => 0100(4)
print(0b0110 | 0b0101) # or => 0111(7)
print(0b0110 ^ 0b0101) # exclusive or => 0011(3)
print(~0b0110) # complement => 1111...1001(-7)
print(2 << 1) # 왼쪽으로 x 비트 만큼 이동하면 결과는 2 * 2**x
print(2 << 2)
print(2 << 3)
print(100 >> 1) # 100 / 2**1 = 100 / 2
print(100 >> 2) # 100 / 2**2 = 100 / 4
print(100 >> 3) # 100 / 2**3 = 100 / 8

print("-------------------")

# 멤버쉽 연산자
# - 값이 해당 배열에 들어있는지 확인
a = ["홍길동", "임꺽정", "유관순"]
print("임꺽정" in a)
print("임꺽정" not in a)

a = [10, 20, 30, 40]
print(30 in a)
print(30 not in a)

print("-------------------")

# Identity 연산자
# - 변수가 동일한 객체를 가리키는지 확인 
a = "홍길동"
b = "홍길동"
print(a is b) # True

c = a
print(c is a) # True

















