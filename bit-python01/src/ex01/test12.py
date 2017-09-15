# 조건문 - if

print("1---------------------------------")

# if 문
age = 10

if age < 19:
    print("미성년")

if age < 19: print("미성년")

# if 문을 한 줄로 작성할 때는 다음에 문장을 추가할 수 없다.
if age < 19: print("미성년")
    #print("성년이 아니다!") # 오류!

print("2---------------------------------")

# if ~ else 문
if age < 19: print("미성년")
else: print("성년")

if age < 19: 
    print("미성년")
else: 
    print("성년")

if age < 19: 
    print("미성년")
    print("*****")
else: 
    print("성년")
    print("*****")

print("3---------------------------------")

# if ~ elif ~ else
if age < 8:
    print("유아입니다.")
elif age >= 8 and age < 14:
    print("어린이입니다.")
elif age >= 14 and age < 19:
    print("청소년입니다.")
else:
    print("성인입니다.")

print("4---------------------------------")

# 리스트에 해당 항목이 존재하는지 여부 검사
arr = ["홍길동", "임꺽정", "유관순", "안중근"]

if "윤봉길" in arr:
    print("있다!")
else:
    print("없다!")

# 리스트가 비어 있는지 여부 검사
if arr:
    print("arr 비어 있지 않다.")
else:
    print("arr 비어 있다.")
    
arr2 = []
if arr2:
    print("arr2 비어 있지 않다!")
else:
    print("arr2 비어 있다.")









