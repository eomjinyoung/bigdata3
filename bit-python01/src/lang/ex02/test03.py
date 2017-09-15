# 함수 - call by value 와 call by reference
# - immutable 값을 넘기면 call by value 가 된다.
# - mutable 값을 넘기면 call by reference 가 된다.

# call by value
def f1(a):
    a = 100;

v1 = 1
v2 = 3.14
v3 = "홍길동"
v4 = True

f1(v1)
print(v1)

f1(v2)
print(v2)

f1(v3)
print(v3)

f1(v4)
print(v4)
