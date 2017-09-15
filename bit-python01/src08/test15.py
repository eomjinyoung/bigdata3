# 클래스 상속 테스트

from ex05.calculator1 import *
from ex05.calculator2 import *
from ex05.calculator3 import *

c1 = Calculator1()
c2 = Calculator2()
c3 = Calculator3()

c1.plus(10)
c1.minus(10)
# Calculator1 클래스에는 다음 메서드가 없기 때문에 호출할 수 없다.
#c1.multiple(10)
#c1.divide(10)

c2.plus(10)
c2.minus(10)
c2.multiple(10)
# Calculator2 클래스에는 다음 메서드가 없기 때문에 호출할 수 없다.
#c2.divide(10)

c3.plus(10)
c3.minus(10)
c3.multiple(10)
c3.divide(10)

print("OK!")





