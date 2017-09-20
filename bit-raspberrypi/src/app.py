import serial
import time
import iot

serialNo = "192.168.0.6"
ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.
print("실행 완료!")

while True:
    value = str(ser.readline(), "utf-8").rstrip().split(":")
    
    if value[0] == "reset" and value[1] == "1":
        result = iot.reset(serialNo)
        print(result)
    
    if value[0] == "motion" and value[1] == "1":
        result = iot.alarm(serialNo, "침입이 감지되었습니다.")
        print(result)
    
    time.sleep(5)
