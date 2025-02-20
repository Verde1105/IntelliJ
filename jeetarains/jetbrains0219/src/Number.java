import java.util.Scanner;

public class Number {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("계산할 숫자를 입력하세요.");
    System.out.println("첫번째 숫자");
    int x = scan.nextInt();
    System.out.println("두번째 숫자.");
    int z = scan.nextInt();

    int y = x % z;
    if (y == 0) {
      System.out.println("입력하신 수는" + x + "와" + z + "이고, 나머지는 짝수 입니다.");
    } else {
      System.out.println("입력하신 수는" + x + "와" + z + "이고, 나머지는 홀수 입니다.");
    }
  }
}
