# 문자열을 다루는 기타 방법

# 이스케이프(escape) 명령
print("Hello,\tworld!")
print("Hello,\nworld!")

# r'' 을 사용하면 문자열 속에 있는 이스케이프 명령이 무시된다.
# r의 의미? raw string
print(r"Hello,\nworld!")

# 항상 \ 다음에 오는 문자는 특별한 의미를 지니는 명령으로 사용되기 때문에
# 다음과 같이 파일의 경로를 표현할 때 오류가 발생한다.
#print("c:\Users\bitcamp") # 실행 오류!

# 이런 경우 r'' 을 사용한다.
print(r"c:\Users\bitcamp")

print("--------------------------------")
# 문자열 형식 정의
print("Hello, {name}") # 일반 문자열 

# f'' 를 사용하면 문자열 속에 변수의 값을 넣을 수 있다.
name = "홍길동"
print(f"Hello, {name}") 

age = 20
print(f"{name} 나이 = {age}")

print("--------------------------------")

# "문자열" % (값, 값, ..) 
print("Hello, %s(%d)!" % ("홍길동", 20))

print("--------------------------------")

# '구분자'.join(문자열 목록) - 구분자를 이용하여 문자열을 연결
print('+'.join(["홍길동", "임꺽정", "유관순"]))
print(",".join(["홍길동", "임꺽정", "유관순"]))
print(' '.join(["홍길동", "임꺽정", "유관순"]))
print('---'.join(["홍길동", "임꺽정", "유관순"]))
print(''.join(["홍길동", "임꺽정", "유관순"]))

print("-----------------------------------")

# '문자열'.split('구분자') - 구분자를 기준으로 문자열을 분리하여 리턴한다.
s1 = "http://localhost:8080/user/json/add?email=hong@test.com&password=1111"
print(s1)

arr1 = s1.split('?') 
print(arr1)

arr2 = arr1[1].split('&')
print(arr2)

print("------------------------------")

# 구분자로 문자열을 잘라서 세 개의 값으로 묶어서 리턴한다.
# 묶은 값은 다음과 같이 변수에 차례대로 저장된다.
# => 변수1, 변수2, 변수3 = "문자열".partition("구분자")
# 여러 개의 값을 묶어 놓은 것 = 튜플(tuple)
v1, v2, v3 = "Content-Type:application/json".partition(":")
print(v1)
print(v2)
print(v3)

print("------------------------------")

# format() 함수
# => 파라미터 인덱스로 문자열 속에 값을 넣는다.
print("{0}, {2}, {1}".format("홍길동", 20, "1111-1111"))

# => 변수명으로 문자열 속에 변수의 값을 넣기 
print("{name}, {tel}, {age}".format(name="임꺽정", age=30, tel="2222-2222"))

# => 객체에 들어 있는 값을 인덱스로 꺼내 문자열 속에 넣기 
print("{obj[0]}, {obj[2]}, {obj[1]}".format( obj=("임꺽정", 30, "2222-2222") ))

# => 배열의 값을 인덱스로 꺼내 문자열 속에 넣기 
print("{arr[0]}, {arr[2]}, {arr[1]}".format( arr=["임꺽정", 30, "2222-2222"] ))

print("-----------------------------")


# 문자열(str 객체)을 바이트 배열(bytes 객체)로 만들기
byteArr = b"ABCabc123"
print(byteArr)
for c in byteArr:
    print(c)

print("-----------------------------")

# 바이트 배열(bytes 객체)을 문자열(str 객체)로 만들기
# => bytes 객체를 그대로 출력
byteObj = b'ABC\xea\xb0\x80\xea\xb0\x81\xea\xb0\x84'
print(byteObj) 

# => bytes 객체를 str 객체로 만들어 출력
s1 = byteObj.decode('UTF-8')
print(s1) 

# => str 객체를 특정 문자 집합으로 인코딩하여 bytes 객체로 만들기
byteObj2 = s1.encode('utf-8') # UTF를 소문자로 작성해도 된다.  
print(byteObj2)








