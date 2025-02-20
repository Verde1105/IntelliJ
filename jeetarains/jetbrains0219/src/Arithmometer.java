import java.util.Scanner;


//이하 계산기
public class Arithmometer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("계산기를 실행합니다.");
    System.out.println("숫자를 입력해주세요");
    int x = scan.nextInt();

    int qed = x;
    int qed2 = qed;

    while (true) {
      scan.nextLine();
      System.out.println("부호를 선택해 주세요.");
      System.out.println("+ , - , * , /");
      String z = scan.nextLine();
      System.out.println("숫자를 입력해주세요");
      int y = scan.nextInt();

      switch (z) {
        case "+":
          qed += y;
          System.out.println("= " + qed);
          break;
        case "-":
          qed -= y;
          System.out.println("= " + qed);
          break;
        case "*":
          qed *= y;
          System.out.println("= " + qed);
          break;
        case "/":
          qed /= y;
          System.out.println("= " + qed);
          System.out.print("나머지는");
          System.out.print(qed2 % y);
          System.out.print("입니다.");
          break;
        case "=":
          System.out.println("= " + qed);
          return;
      }
    }
  }
}
