# 함수 - call by value 와 call by reference II
# - immutable 값을 넘기면 call by value 가 된다.
# - mutable 값을 넘기면 call by reference 가 된다.

# call by reference
def f1(a):
    a[0] = 100;

l1 = [1, 2, 3]
f1(l1) # 리스트의 주소가 넘어간다.
print(l1)

t1 = (1, 2, 3)
#f1(t1) # 튜플의 주소가 넘어간다.
       # 그러나 튜플의 값을 변경할 수 없기 때문에
       # 오류 발생!
       
print("-----------------------")

def f2(d):
    d['tel'] = '1111-2222'

d1 = {
    'name': '홍길동',
    'age': 20,
    'working': True,
    }
f2(d1) # 딕셔너리의 주소를 넘긴다.
print(d1)
    
print("-----------------------")

def f3():
    return {'name': '홍길동', 'age': 20}

d2 = f3()
print(d2)
    
    
    
    
    