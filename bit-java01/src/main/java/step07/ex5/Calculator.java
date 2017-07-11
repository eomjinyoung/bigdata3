package step07.ex5;

public class Calculator {
  
  static float result = 0f; 

  static void plus(float b) {
    result += b; // result = result + b;
  }
  
  static void minus(float b) {
    result -= b; // result = result - b;
  }
  
  static void multiple(float b) {
    result *= b; // result = result * b;
  }
  
  static void divide(float b) {
    result /= b; // result = result / b;
  }
  
}
