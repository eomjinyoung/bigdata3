# 장비를 켰을 때 서버에 장비를 등록하는 예 
import requests
import json

serverUrl = "http://localhost:8080/device/json"
deviceResetUrl = serverUrl + "/reset/{0}" 
serialNo = "192.168.0.6"

# 장비 등록 요청
# http://localhost:8080/device/json/reset/192.168.0.6
response = requests.get(deviceResetUrl.format(serialNo))
result = json.loads(response.text)

if result["state"] == "success":
    print("장비 등록 성공!")
else:
    print("장비 등록 실패!")

print("종료!")



