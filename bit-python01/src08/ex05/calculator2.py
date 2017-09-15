# 클래스 상속

from ex05.calculator1 import Calculator1

class Calculator2(Calculator1):
    '''클래스에 대한 간단한 설명'''
    
    def multiple(self, value):
        '''곱하기를 수행하는 메서드'''
        self.result *= value
    
    
    
    