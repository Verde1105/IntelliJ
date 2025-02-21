import java.util.InputMismatchException;
import java.util.Scanner;


//이하 계산기
public class Arithmometer {
  public static void main(String[] args) {

    System.out.println("계산기를 실행합니다.");
    switchCase();
  }

  public static String validation() {
    Scanner scan = new Scanner(System.in);
    System.out.println("부호를 선택해 주세요.");
    System.out.println("+ , - , * , /");
    String sign = scan.nextLine();

    if (!sign.equals("-") && !sign.equals("=") && !sign.equals("+") && !sign.equals("*") && !sign.equals("/")) {
      System.out.println("잘못된 입력값입니다.");
      System.out.println("다시 입력해 주세요.");
      return validation();
    } else if (!(sign instanceof String)) {
      System.out.println("잘못된 입력값입니다.");
      System.out.println("숫자를 입력할 수 없습니다. 다시 입력해주세요.");
      return validation();
    }
    return sign;
  }

  public static int validationInt() {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    try {
      System.out.println("숫자를 입력해주세요");
      i = scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("잘못된 입력값입니다.");
      System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
      scan.nextLine();
      return validationInt();
    }

    return i;
  }

  public static void switchCase() {
    int qed = validationInt();//최초 값 입력

    while (true) {
      int qed2 = qed;//기본전달값 + @ 값

      String sign = validation();//부호입력

      if (sign.equals("=")) {
        System.out.println("= " + qed2);
        break;
      }

      int y = validationInt();//두번째 값 입력

      switch (sign) {
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
      System.out.println("계산을 끝내려면 = 부호를 눌러주세요.");
    }
  }
}

