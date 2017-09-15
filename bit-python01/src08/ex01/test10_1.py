# 컬렉션 - 딕셔너리(dictionary)
# - 개념은 자바의 Map과 같다
# - 코드 문법은 자바스크립트의 객체 표기법과 유사하다.
# - value를 저장할 때 key를 사용한다.

print("1------------------------------")

# 딕셔너리 생성
d1 = {'name': '홍길동', 'age': 20, 'working': True}

# 딕셔너리 값 꺼내기
print(d1['name'], d1['age'], d1['working'])
print(d1.get('name'), d1.get('age'), d1.get('working'))

#print(d1['tel']) # 오류! 존재하지 않는 key를 지정하면,
print(d1.get('tel')) # None 리턴. 존재하지 않는 key를 지정하면,


# 값 추가하기
d1['tel'] = '1111-1111'
print(d1)

print("2------------------------------")

# 빈 딕셔너리 생성
d2 = {}
d2['name'] = "임꺽정"
d2['age'] = 20
d2['working'] = True
print(d2)

# 딕셔너리 항목 값 변경
d2['name'] = "유관순"
print(d2)

# 딕셔너리 항목 제거
del d2['name']
print(d2)

print("3------------------------------")

# 딕셔너리 생성할 때 여러 줄에 작성하기
d3 = {
    'name': '홍길동', 
    'age': 20, 
    'working': True, # 맨 끝에 콤마를 붙여도 된다.
}
print(d3)

print(d3['name'])

# 참고!

# 그냥 str 객체의 title() 함수를 호출한다.
# - title()은 그 객체의 내용을 출력한다.
# - int 객체는 title() 함수가 없기 때문에 호출할 수 없다.
print(d3['name'].title())
#print(d3['age'].title()) # 오류!

# str 객체는 title() 함수가 있다.
s1 = "홍길동"
print(s1)
print(s1.title())







