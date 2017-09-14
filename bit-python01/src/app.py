import serial
import time
import iot

serialNo = "192.168.0.6"
ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.


while True:
    value = str(ser.readline(), "utf-8").rstrip().split(":")
 
    if value[0] == "reset" and value[1] == "1":
        result = iot.reset(serialNo)
        print(result)
    
    time.sleep(5)
