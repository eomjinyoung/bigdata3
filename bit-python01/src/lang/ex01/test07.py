# 컬렉션 - 리스트

print("1 ---------------------------------")

arr = [] # 빈 배열
print(arr)

arr = [1, 2, "홍길동", True, None, 3.14]
print(arr)

print(arr[0], arr[5], arr[-1], arr[-6])


#print(arr[6]) # 오류! 인덱스의 크기를 넘을 수는 없다. 
#print(arr[-7]) # 오류! 뒤로 한 바퀴를 넘을 수는 없다.

print("2 ---------------------------------")

# 리스트의 범위 지정
arr = [1, 2, "홍길동", True, None, 3.14]
print(arr[1:3]) # 1 에서 3 전까지 복사하여 새 리스트 리턴
print(arr[1:]) # 1 에서 끝까지 복사하여 새 리스트 리턴
print(arr[:3]) # 3 전까지 복사하여 새 리스트 리턴 

print(arr)

# 지정된 범위의 값을 추출하여 새 리스트를 만든다.
arr2 = arr[1:3]
print(arr2)

arr2[1] = "임꺽정"
print(arr2)

print(arr)

print("3 ---------------------------------")

# 리스트 값 변경
arr = [1, 2, "홍길동", True, None, 3.14]
arr[2] = "임꺽정"
print(arr)

# 리스트 끝에 항목 추가
arr.append("오호라")
print(arr)

# 중간에 추가
arr.insert(2, "항목추가")
print(arr)

# 항목 제거
del arr[3]
print(arr)

# 맨 끝에 항목 제거
print(arr.pop()) # pop()의 리턴 값은 제거된 항목이다.
print(arr)

# 임의 위치에 항목 제거
print(arr.pop(3)) # 항상 pop()은 제거된 값을 리턴한다.
print(arr)

print("4 ------------------------")

# 인덱스가 아닌 값으로 제거할 항목을 찾기
arr = [1, 2, "홍길동", True, None, 3.14, 2, 1, 2]
arr.remove(2) # 첫 번째 찾은 값을 제거한다.
print(arr)

# 리스트 길이 알아내기
print(len(arr))

print("5 ----------------------------")

# 리스트 정렬
#arr.sort() # 오류! 문자열과 숫자가 섞여 있어 안된다.

arr = [7, 5, 8, 1, 2, 9, 6, 3, 4]
print(arr)

arr.sort()
print(arr)

arr.sort(reverse=True)
print(arr)

arr = ["홍길동", "임꺽정", "유관순", "안중근", "윤봉길"]
arr.sort()
print(arr)

print("6 ----------------------------------")

# 리스트 병합
arr1 = ["홍길동", "임꺽정"]
arr2 = ["유관순", "안중근", "윤봉길"]
arr3 = arr1 + arr2
print(arr3)

# 리스트를 여러 개 중복 생성하기
arr4 = arr1 * 3
arr5 = 3 * arr1
print(arr4)
print(arr5)

print("7 ----------------------------------")

# 리스트에서 값 찾기
arr = ["홍길동", "임꺽정", "유관순", "안중근", "홍길동", "윤봉길"]
print(arr.index("안중근"))

# 리스트에서 같은 값을 갖는 항목의 개수를 세기
print(arr.count("홍길동"))

arr = ["홍길동", 20, "임꺽정", 30, "안중근", 20, "윤봉길", "20"]
print(arr.index("임꺽정"))
print(arr.count(20))

print("8 ----------------------------------")

arr = ["홍길동", "임꺽정", "유관순", "안중근", "홍길동", "윤봉길"]

# 리스트 복사
arr2 = arr[:] # 처음부터 끝까지 범위를 지정하면 된다.
arr3 = arr # 같은 리스트를 가리킨다.

arr2[0] = "오호라"
print(arr)

arr3[0] = "오호라"
print(arr)

print(type("홍길동").__name__)
print(type(10).__name__)
print(type(3.14).__name__)
print(type(True).__name__)











