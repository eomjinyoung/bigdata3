# 톰캣 서버로부터 Volume 설정 정보를 받아 USB로 보낸다.
import requests
import json
import serial
import time

ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.
print("시리얼 포트가 준비되었습니다.") 

while True:
    response = requests.get("http://localhost:8080/arduino/json/getVolumeControl")
    volumeControl = str(json.loads(response.text)["data"])

    if volumeControl == "software": # 소프트웨어로 볼륨 크기를 조정한다면,
        print("볼륨 조정 방식: software")
        
        # 서버에서 볼륨 크기를 가져온다.
        response = requests.get("http://localhost:8080/arduino/json/getVolume")
        volumeSize = str(json.loads(response.text)["data"])
        print("서버볼륨:", volumeSize)
        
        # 보드를 "소프트웨어 볼륨 조정" 상태로 설정한다. 
        ser.write(b"ctr=sw")
        result = str(ser.readline(), 'utf-8').rstrip()
        print("보드 볼륨 방식을 software로 변경:", result)
        
        # 볼륨 크기를 보드에 전달한다.
        ser.write(str("vol=" + volumeSize).encode())
        result = str(ser.readline(), 'utf-8').rstrip()
        print("보드 볼륨 설정:", result)
        
    else: # 하드웨어로 볼륨 크기를 조정한다면,
        # 보드를 "하드웨어 볼륨 조정" 상태로 설정한다. 
        ser.write(b"ctr=hw")
        result = str(ser.readline(), 'utf-8').rstrip()
        print("보드 볼륨 방식을 hardware로 변경:", result)
        
        # 하드웨어의 현재 볼륨 값을 가져온다.
        ser.write(b'vol')
        volumeSize = str(ser.readline(), 'utf-8').rstrip()
        print("하드웨어볼륨:", volumeSize)
        
        # 볼륨 값을 서버에 전송한다.
        response = requests.get("http://localhost:8080/arduino/json/setVolume/" + volumeSize)
        result  = str(json.loads(response.text)["state"])
        print("서버 볼륨 설정:", result);
        
    time.sleep(5)
    
ser.close()
print("종료!")