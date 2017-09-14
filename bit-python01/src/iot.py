# IoT 서버 요청 관련 함수 정의
import requests
import json

serverUrl = "http://localhost:8080"

def reset(serialNo):
    url = serverUrl + "/device/json/reset/{0}"
    response = requests.get(url.format(serialNo))
    return json.loads(response.text)

def alarm(serialNo, message):
    url = serverUrl + "/alarm/json/change/{0}?message={1}"
    response = requests.get(url.format(serialNo, message))
    return json.loads(response.text)