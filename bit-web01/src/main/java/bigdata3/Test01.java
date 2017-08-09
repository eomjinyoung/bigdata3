package bigdata3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Car {
  @Autowired Engine engine;
}

@Component
class Engine {
  @Autowired Oil oil;
}

@Component
class Oil {}

public class Test01 {

  public static void main(String[] args) {
    Car obj1 = new Car();
    Engine obj2 = new Engine();
    Oil obj3 = new Oil();
    
    obj1.engine = obj2;
    obj2.oil = obj3;

  }

}




