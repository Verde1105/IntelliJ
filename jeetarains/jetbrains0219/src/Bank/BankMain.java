package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String userName;
    String password;
    int bal1 = 0;// 랜덤함수 추가해서 계좌생성
    int bal2 = 0;
    int bal3 = 0;
    int account;

    Bank li = new Bank();
    List<Object> userLi = li.listM();

    System.out.println("이름을 입력해주세요.");
    userName = li.sc();
    userLi.add(userName);

    System.out.println("사용하실 패스워드를 입력해주세요.");
    password = sc.nextLine();
    userLi.add(password);
    System.out.println("금액을 입력해주세요.");
    account = sc.nextInt();
    userLi.add(account);

    System.out.println(userLi);
  }

}

class Bank {
  public List<Object> listM() {
    return new ArrayList<>();
  }

  public String sc() {
    Scanner sc = new Scanner(System.in);
    String i = sc.nextLine();
    List<Object> listM = listM();

    for (int x = 0; x < listM.size(); x++) {
      if (i == null || i.equals("")) {
        System.out.println("공백은 안됩니다. 다시 입력해주십시오.");
        return sc();
      } else if (i.equals(listM)) {
        System.out.println("이미 존재하는 이름입니다. 다시 입력해주십시오.");
        return sc();
      }
    }
    return i;
  }
}
