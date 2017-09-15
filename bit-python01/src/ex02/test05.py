# 함수 - 가변 길이 파라미터

print("1-------------------------")

# 아규먼트를 0 개 이상 받는 파라미터

def f1(a, b, *params):
    print(a, b, params)

f1(10, 20)
f1(10, 20, 30, 40)
f1(10, 20, "홍길동", 20, "임꺽정", 30)
f1(10, 20, [30, 40])
    
print("2-------------------------")

# key-value 한쌍의 값을 0 개 이상 받는 파라미터
def f2(name, **scoreDic):
    scores = scoreDic.values()
    s = sum(scores)
    a = s / len(scores)
    
    print(f"이름: {name}")
    print("총점: %d" % s)
    print("평균: {0}".format(a))
    
f2("홍길동", kor=100, eng=97, math=98)












