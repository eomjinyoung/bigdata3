package bigdata3.domain;

public class ClassRoom {
  protected int no; // field
  protected String name; // field
  
  @Override
  public String toString() {
    return "ClassRoom [no=" + no + ", name=" + name + "]";
  }
  public int getNo() { // getter = property : property name = "no"
    return no;
  }
  public void setNo(int no) { // setter = property : property name = "no"
    this.no = no;
  }
  public String getName() { // getter = property
    return name;
  }
  public void setName(String name) { // setter = property
    this.name = name;
  }
  
  
}
