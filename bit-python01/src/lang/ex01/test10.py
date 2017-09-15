# 조건문 - if

# if 문
age = 10

if age < 19:
    print("미성년")

if age < 19: print("미성년")

# if 문을 한 줄로 작성할 때는 다음에 문장을 추가할 수 없다.
if age < 19: print("미성년")
    #print("성년이 아니다!") # 오류!

print("---------------------------------")

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

print("---------------------------------")

# if ~ elif ~ else
if age < 8:
    print("유아입니다.")
elif age >= 8 and age < 14:
    print("어린이입니다.")
elif age >= 14 and age < 19:
    print("청소년입니다.")
else:
    print("성인입니다.")








