public class Person {

  private String name;
  private int age;

  public static void main(String[] args) {
    Person p = new Person();
    p.setName("John");
    p.setAge(30);

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }


}
