# 장비를 켰을 때 서버에 장비를 등록하는 예 
import requests
import json

restServerUrl = "http://localhost:8080/device/json" 
serialNo = "192.168.0.6"
email = "user6@test.com"

def regUrl(email, serialNo):
    "사용자 이메일과 시리얼 번호로 장비를 서버에 등록하는 URL 리턴"
    return "{0}/add/{1}/{2}".format(restServerUrl, email, serialNo)

# 장비 등록 요청
# http://localhost:8080/device/json/add/user6@test.com/192.168.0.6
response = requests.get(regUrl(email, serialNo))
result = json.loads(response.text)

if result["state"] == "success":
    regNo = result["data"]
    print(regNo)


print("종료!")



