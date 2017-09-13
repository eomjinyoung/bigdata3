# HTTP Client 만들기
import requests
import json

response = requests.get("http://localhost:8080/arduino/json/getLED")
print(response.status_code)
print(response.text)

# 서버에서 받은 JSON 문자열을 객체로 변환시키기
obj = json.loads(response.text)
print(obj['state'])
print(obj['data'])
