# 웹 애플리케이션 만들기

## 이클립스에 서블릿 컨테이너의 홈 폴더 등록하기
이클립스에서 웹 애플리케이션을 테스트할 때 사용할 서버를 등록해야 한다.

- Eclise메뉴 > Window > Preference.. > Servet 노드 > Runtime Environments > 서버 등록

## 이클립스에 웹 애플리케이션을 테스트하기 위한 개발환경 등록
웹 애플리케이션을 테스트할 때 사용할 별도의 서버 환경을 구축해야 한다.

- Add > 톰캣 서버 개발 환경 등록 
- 개발 환경을 등록하면 웹 애플리케이션을 테스트할 때 별도의 디렉토리에서 배포하고 실행한다.
- 예) C:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0

## 웹 프로젝트 폴더 생성
웹 애플리케이션을 관리할 프로젝트 폴더를 준비해야 한다. 가능한 Maven 표준 디렉토리 구조로 만들라!

```
프로젝트 폴더/
  src/
    main/
      java/
      resources/
      webapp/
    test/
      java/
      resources/
  build.gradle 
```

## Gradle 설정 파일 작성
웹 프로젝트를 빌드하거나 이클립스와 관련된 설정 파일을 만들 때 사용할 플러그인과 설정을 추가한다.

- build.gradle 파일 참조하라!

```
apply plugin: "java"
apply plugin: "eclipse-wtp"
apply plugin: "war"

compileJava {
  options.encoding = 'UTF-8'  // 자바 소스 파일의 인코딩
  sourceCompatibility = '1.8' // 소스 코드의 자바 버전 
}

eclipse {
  wtp {
    facet {
      facet name: 'jst.web', version: '3.1'  // 사용할 서블릿 API 버전  
      facet name: 'jst.java', version: '1.8' // 웹 프로그램 개발할 때 사용한 자바 버전
    }
  }
}

repositories {
  mavenCentral()
}

dependencies {
  providedCompile group: 'javax.servlet', name: 'javax.servlet-api', version: '3.1.0'
}
```

## 이클립스의 웹 프로젝트와 관련된 설정 파일을 만든다.
다음 Gradle 명령을 실행하라! 명령을 실행한 다음에 반드시 이클립스에서 프로젝트를 "refresh" 하라!

```
> gradle eclipse
``` 









