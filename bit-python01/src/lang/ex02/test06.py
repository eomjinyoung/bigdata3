# 함수 - 값 리턴하기

print("1-------------------------")

# => 값 한 개 리턴 
def f1(a, b):
    return a + b

print(f1(10, 20))

print("1-------------------------")

# => 튜플 리턴
def f2(name, kor, eng, math):
    sum = kor + eng + math
    aver = sum / 3
    return name, sum, aver # 리턴하는 것은 튜플 객체이다.

n, s, a = f2("홍길동", 100, 97, 90)
print(n, s, a)

# => 튜플 리턴 II

def f3(name, kor, eng, math):
    sum = kor + eng + math
    aver = sum / 3
    
    # 괄호를 사용하여 튜플임을 명시할 수 있다.
    return (name, sum, aver) 

n, s, a = f2("홍길동2", 100, 97, 90)
print(n, s, a)








