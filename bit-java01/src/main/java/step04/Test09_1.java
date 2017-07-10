/* 연산자 우선순위
postfix       : expr++ expr--
unary         : ++expr --expr +expr -expr ~ !
multiplicative: * / %
additive      : + -
shift         : << >> >>>
relational    : < > <= >= instanceof
equality      : == !=
bitwise AND   : &
bitwise exclusive OR:  ^
bitwise inclusive OR:  |
logical AND         : &&
logical OR          : ||
ternary             : ? :
assignment          : = += -= *= /= %= &= ^= |= <<= >>= >>>= 
 */
package step04;

public class Test09_1 {
  public static void main(String[] args) {
    int r1 = 10 + 8 / 2 - 3 * 2;
    System.out.println(r1);
    
    int a = 10;
    int r2 = a++ + a++ + a++; // = 10 + 11 + 12 = 33
    System.out.printf("%d, %d\n", a, r2);
    
    a = 10;
    r2 = ++a + ++a + ++a; // = 11 + 12 + 13
    System.out.printf("%d, %d\n", a, r2);
    
    a = 3;
    r2 = a++ + a++ * a++; // = 3 + 4 * 5 = 3 + 20 = 23
    System.out.printf("%d, %d\n", a, r2);
  }
}








