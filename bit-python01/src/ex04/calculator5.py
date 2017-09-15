# 클래스 만들기 - 클래스 변수와 클래스 메서드 정의하기
# - 변수는 그냥 선언한다.
# - 메서드 정의 앞에 @classcmethod 를 붙인다.
# - 클래스 메서드는 클래스 변수를 사용할 수 있게 클래스 레퍼런스를 준다.
# - 즉 클래스 변수를 사용하려면 스태틱 메서드 대신 클래스 메서드를 정의하라!

print("calculator5.Calculator 클래스...")

class Calculator:
    '''클래스에 대한 간단한 설명'''
    
    # 클래스 변수
    # - 클래스 변수는 클래스 레퍼런스로 접근할 수 있다.
    result = 0
    
    @classmethod
    def plus(cls, value):
        # 클래스 메서드가 호출될 때 첫 번째 파라미터로 
        # 클래스 레퍼런스가 넘어온다. 
        # 이 레퍼런스를 받을 파라미터를 반드시 선언해야 한다.
        # 이 레퍼런스의 변수명은 개발자가 마음대로 작성해도 되지만,
        # 관례상 cls로 하는 게 좋다.
        cls.result += value
    
    @classmethod
    def minus(cls, value):
        cls.result -= value 
    
    @classmethod
    def multiple(cls, value):
        cls.result *= value
    
    @classmethod
    def divide(cls, value):
        # 물론 클래스 변수에 접근 할 때 다음과 같이 클래스 이름을 직접 줘도 되지만,
        #Calculator.result /= value
        
        # 가능한 파라미터로 넘어온 클래스 레퍼런스를 사용하라!
        cls.result /= value
    
    
    
    