# 함수 - 정의하기

# => 함수를 정의할 때 첫 번째 줄에 
#    document string(docstring)으로 
#    함수에 대한 간단한 설명을 적는 것이 관례다.

def f1():
    '''함수에 대한 간단한 설명'''
    print("Hello, world!")

f1()


# => 파라미터와 리턴 값 없는 함수
def hello():
    print("Hello!")

hello()

# => 파라미터만 있는 함수
def hello2(name):
    print(f"Hello, {name}")

hello2("홍길동")

# => 값을 리턴하는 함수
def hello3():
    return "임꺽정"

print(hello3())

# => 파라미터와 리턴 값이 있는 함수
def hello4(name):
    return f"Hello, {name}"

print(hello4("임꺽정"))

# => 리턴하지 않은 함수의 값을 받으려 할 경우
value = hello() # 값을 리턴하지 않으면 None이 된다.
print(value)





