# 클래스 만들기 - 인스턴스 변수와 인스턴스 메서드 정의하기
# - 인스턴스 변수는 보통 초기자(initializer)에서 준비한다.
# - 메서드 정의 앞에 데코레이터(decorator)를 붙이지 않는다.
# - 인스턴스가 있어야만 호출할 수 있다.

print("calculator5.Calculator 클래스...")

class Calculator:
    '''클래스에 대한 간단한 설명'''
    
    # initializer
    def __init__(self):
        '''인스턴스 변수를 준비하고 초기화 시키는 initializer'''
        # 이 메서드는 인스턴스를 생성할 때 호출된다.
        # 보통 인스턴스 변수를 준비하고 초기화시키는 일을 한다.
        
        print("Calculator6.__init__()...")

        # 인스턴스 변수 준비?
        # - 그냥 self 레퍼런스에 변수를 지정하면 된다.
        # - 기본 인스턴스에 변수를 추가하는 방식이다.
        self.result = 0
        
    def plus(self, value):
        '''더하기를 수행하는 메서드'''
        # 모든 인스턴스 메서드는 첫번째 파라미터 값으로 인스턴스의 주소가 넘어온다.
        # 이 주소를 받을 파라미터는 첫 번째 순서로 반드시 선언해야 한다.
        # 파라미터 명은 "self" 이어야 한다.
        self.result += value
    
    def minus(self, value):
        '''빼기를 수행하는 메서드'''
        self.result -= value 
    
    def multiple(self, value):
        '''곱하기를 수행하는 메서드'''
        self.result *= value
    
    def divide(self, value):
        '''나누기를 수행하는 메서드'''
        self.result /= value
    
    
    
    