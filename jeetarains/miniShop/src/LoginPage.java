import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LoginPage {

  public static String login(List<HashMap<String, String>> list) {
    String loginYn = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("로그인하시겠습니까?");
    System.out.print("아이디 : ");
    String userId = sc.nextLine();
    System.out.print("비밀번호 : ");
    String userPw = sc.nextLine();

    for (HashMap<String, String> map : list) {
      if (userId.equals(map.get("id"))) {
        if (map.get("pw").equals(userPw)) {
          System.out.println("로그인 되었습니다.");
          return loginYn = map.get("회원번호");
        } else {
          System.out.println("잘못된 비밀번호 입니다.");
          break;
        }
      }
    }
    return loginYn;
  }

  public static String de(List<HashMap<String, String>> list) {
    String yn = null;
    Scanner sc = new Scanner(System.in);
    System.out.print("아이디 : ");
    String userId = sc.nextLine();
    System.out.print("비밀번호 : ");
    String userPw = sc.nextLine();
//입력값과 아이디와 비교할때, 비번과 비교할때 등 변수별로 메소드 작게 만들어놓기
    for (HashMap<String, String> map : list) {
      if (userId.equals(map.get("id"))) {
        if (map.get("pw").equals(userPw)) {
          return yn = map.get("회원번호");
        } else {
          break;
        }
      }
    }
    return yn;
  }

}
