# Serial 입출력
# 1) USB 시리얼 입출력을 도와줄 모듈을 설치해야 한다.
#    > python -m pip install pyserial
# 2) 소스 파일에서 해당 모듈을 임포트 한다.
import serial
import time

ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(3) # 장비와 연결될 시간을 확보한다.
print("시리얼 포트가 준비되었습니다.") 

ser.write(b'1') # 장비로 바이트 배열을 보낸다. 
line = ser.readline() # 장비로부터 바이트 배열을 받는다.
print(str(line, 'utf-8').rstrip()) # 바이트 배열을 string 객체로 변환한 후 출력한다.

ser.close()
print("종료!")