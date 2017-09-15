# 클래스 만들기 - 특별한 빌트인 메서드
# => __add__(self, other) : + 연산자를 사용하여 인스턴스 끼리 더할 때 호출된다.
# => __sub__(self, other) : - 연산자를 사용하여 인스턴스에서 다른 인스턴스를 뺄때
#                           호출된다.
# => __del__(self) : 가비지 컬렉터에 의해 제거될 때 호출된다. 
#                    소멸자(destructor)라 부른다.


print("calculator5.Calculator 클래스...")

class Calculator:
    '''클래스에 대한 간단한 설명'''
    
    # initializer
    def __init__(self):
        '''인스턴스 변수를 준비하고 초기화 시키는 initializer'''
        self.result = 0
        
    def __add__(self, other):
        '''두 인스턴스의 값을 더한다'''
        self.result += other.result
    
    def __sub__(self, other):
        '''이 인스턴스에서 다른 인스턴스의 값을 뺀다.'''
        self.result -= other.result
        
        
    def plus(self, value):
        '''더하기를 수행하는 메서드'''
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
    
    
    
    