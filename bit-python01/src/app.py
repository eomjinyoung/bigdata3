import serial
import time
import iot

serialNo = "192.168.0.6"
ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.

while True:
    ser.write(b"reset")
    result = str(ser.readline(), "utf-8").rstrip()
    print(result)
    time.sleep(5)


#result = iot.reset(serialNo)
#print(result)