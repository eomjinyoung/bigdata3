# 키보드로부터 입력 받은 것을 USB로 보내기
import serial
import time

ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.
print("시리얼 포트가 준비되었습니다.") 

while True:
    msg = input("LED ON/OFF: (1:ON, 0:OFF) ") # 키보드에서 사용자 입력을 받는다.
    if msg == "q":
        break
    data = str.encode(msg) # 입력된 문자열을 바이트 배열로 변환한다.

    ser.write(data) # 장비로 바이트 배열을 보낸다. 
    line = ser.readline() # 장비로부터 바이트 배열을 받는다.
    print(str(line, 'utf-8').rstrip()) # 바이트 배열을 string 객체로 변환한 후 출력한다.

ser.close()
print("종료!")