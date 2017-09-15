# 클래스 만들기 - 스태틱 메서드 정의하기
# - 메서드 정의 앞에 @staticmethod 를 붙인다.

print("calculator4.Calculator 클래스...")

class Calculator:
    '''클래스에 대한 간단한 설명'''
    
    @staticmethod
    def plus(a, b):
        return a + b
    
    @staticmethod
    def minus(a, b):
        return a - b
    
    @staticmethod
    def multiple(a, b):
        return a * b
    
    @staticmethod
    def divide(a, b):
        return a / b