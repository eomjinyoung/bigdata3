# 반복문

print("1-------------------------")
# while 문
i = 0

while i < 5:
    print(i)
    i += 1

print("2-------------------------")

# for 문
i = 0
for i in range(5):
    print(i)
    

print("3-------------------------")

# 리스트에 반복문 적용하기
arr = ["홍길동", "임꺽정", "유관순", "안중근"]
for value in arr:
    print(value)

print("4-------------------------")

# 딕셔너리에 반복문 적용하기
scoreDic = {
    "홍길동": [100, 100, 100],
    "임꺽정": [90, 90, 90],
    "유관순": [80, 80, 80],
    }

# => 딕셔너리에서 key,value 한쌍을 꺼낸다.
for k, v in scoreDic.items():
    print("%s=%d" % (k, sum(v)))

print("5-------------------------")

# => 딕셔너리에서 key만 꺼낸다.
for k in scoreDic.keys():
    print(k) 

print("6-------------------------")

# => 딕셔너리에서 value만 꺼낸다.
for v in scoreDic.values():
    print(v)


