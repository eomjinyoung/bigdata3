# 라즈베리파이 설치 
1) 설치 파일 다운로드
  - https://www.raspberrypi.org/
  - NOOBS의 오프라인 버전 다운로드
  - NOOBS 압축 해제
2) 설치 디스크 준비
  - MicroSD 메모리 카드의 파티션 준비
    - 기존 볼륨 모두 제거
    - 기존 파티션 모두 제거
    - 단일 파티션으로 만든다.
  - Micro SD 카드 포맷 
    - FAT32, 기본 할당 크기
  - NOOBS 압축 해제 파일을 모두 MicroSD 메모리 카드로 복사한다. 
3) 라즈베리파이에 OS 설치
  - MicroSD 카드를 꼽고 전원을 넣는다.
  - Raspbian [Recommended] 선택
  - "install" 버튼 클릭
  - 설치 완료 후 리부팅
4) 라브베리파이 업데이트
  - 라즈베리파이 업데이트 정보 가져오기
    - sudo apt-get update
  - 라즈베리파이 업그레이드
    - sudo apt-get upgrade
  - 라브베리파이 펌웨어 업데이트
    - sudo rpi-update
5) 한글 입력기 및 한글 폰트 설치
  - 한글 입력기 설치
    - sudo apt-get ibus
    - sudo apt-get ibus-hangul
  - 한글 폰트 설치
    - sudo apt-get fonts-unfonts-core
6) 리눅스 한글 입력기 및 키보드 설정
  - 리눅스 설명에 따라 준비
  - 한글을 사용하려면 리눅스 바탕화면의 타이틀바에서 오른쪽 상단의 입력기를 한글로 설정한다.
  - 그런 후에 "한글" 키나 "shift + space" 키를 눌러 한글/영어 전환할 수 있다. 
7) 아두이노 개발 도구 설치
  - sudo apt-get install arduino
8) vim 에디터 설치
  - sudo apt-get install vim










