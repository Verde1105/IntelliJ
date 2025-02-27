import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
  ArrayList<String> li = new ArrayList<>();
  String name = null;

  public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the person");
    name = new String(sc.nextLine());
    if (name != null) {
      if (!name.equals(li)) {
        li.add(name);
        System.out.println(li);
        return;
      }
    }
  }
}

class auto {

}
