# 클래스 상속 

#class Calculator1: # 아무것도 상속 받지 않는 경우에는 괄호를 치지 않아도 된다.
class Calculator1(): # 또는 이렇게 빈 괄호를 쳐도 된다.
    '''클래스에 대한 간단한 설명'''
    
    # initializer
    def __init__(self):
        '''인스턴스 변수를 준비하고 초기화 시키는 initializer'''
        self.result = 0
        
    def plus(self, value):
        '''더하기를 수행하는 메서드'''
        self.result += value
    
    def minus(self, value):
        '''빼기를 수행하는 메서드'''
        self.result -= value 
    
