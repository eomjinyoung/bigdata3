# 교실 관리 기능 추가

## 도메인 클래스 정의
- 교실 데이터를 저장할 사용자 정의 데이터 타입을 만든다.
- domain 패키지에 만든다.
- croom 테이블의 컬럼 데이터를 저장할 수 있도록 필드를 선언해야 한다.
- ClassRoom.java 

## DAO 인터페이스 정의
- 교실 데이터를 다룰 DAO 인터페이스를 정의한다.
- 한 번에 모든 메서드를 만들지 말고 한 개씩 만들면서 나간다.
- 기존의 DAO 인터페이스를 복사하여 그 중 당장 만들 메서드만 남기고 모두 지운다.
- dao 패키지에 만든다.
- ClassRoomDao.java 

## SQL 맵퍼 파일 준비
- DAO에서 사용할 SQL 맵퍼 파일을 준비한다.
- DAO 인터페이스의 메서드에서 사용할 SQL문을 만든다.
- 기존의 SQL 맵퍼 파일을 복사하여 그 중 인터페이스에 선언된 메서드와 연결되는 것만 만든다.
- dao 패키지에 만든다.
- ClassRoomDao.xml

## 서비스 클래스 정의
- 교실 관련 업무 로직을 담당할 클래스를 만든다.
- 기존의 서비스 인터페이스와 클래스를 복사하여, 당장 구현할 메서드만 남겨준다.
- service/ClassRoomService.java
- service/impl/ClassRoomServiceImpl.java

## 페이지 컨트롤러 정의
- 교실 관련 작업 요청을 처리할 클래스를 만든다.
- 기존의 페이지 컨트롤러를 복사하여 당장 요청을 처리할 메서드만 남겨둔다.
- control/ClassRoomControl.java

## 뷰 컴포넌트 정의
- 교실 관련 작업 결과를 출력할 JSP를 만든다.
- 기본의 JSP를 복사하여 현재 결과에 맞게 변경한다.
- /WEB-INF/jsp/classroom/list.jsp






