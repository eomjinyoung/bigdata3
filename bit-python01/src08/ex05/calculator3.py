# 클래스 상속

from ex05.calculator2 import Calculator2

class Calculator3(Calculator2):
    '''클래스에 대한 간단한 설명'''
    
    def divide(self, value):
        '''나누기를 수행하는 메서드'''
        self.result /= value
    
    
    
    