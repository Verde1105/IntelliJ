import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JoinPage {
  public JoinPage() {
  }

  public static String userNumRan() {
    int ran1 = 0;
    int ran2 = 0;
    int longRan = 0;
    String num = "";
    String num1 = "";
    String num2 = "";
    String num3 = "";

    ran1 = (int) (Math.random() * 100);
    ran2 = (int) (Math.random() * 100);
    longRan = (int) (Math.random() * 100000 + 10000);

    if (ran1 < 10) {
      num1 = "00" + ran1;
    } else {
      num1 = "0" + ran1;
    }
    if (ran2 < 10) {
      num2 = "-00" + ran2;
    } else {
      num2 = "-0" + ran2;
    }
    if (longRan < 100000) {
      num3 = "-0" + longRan;
    } else {
      num3 = "-" + longRan;
    }
    num = num1 + num2 + num3;
    return num;
  }

  public HashMap<String, String> join() {
    UserDTO dto = new UserDTO();
    Scanner sc = new Scanner(System.in);
    List<HashMap<String, String>> list = new ArrayList<>();

    System.out.println("아이디를 입력해주세요");
    dto.setId(sc.nextLine());
    HashMap stringMap = Service.hmList("id", dto.getId());
    stringMap.put("유저타입", dto.getUserType());

    System.out.println("비밀번호를 입력해주세요");
    dto.setPw(sc.nextLine());
    stringMap.put("pw", dto.getPw());

    System.out.println("사용하실 이름을 입력해주세요");
    dto.setName(sc.nextLine());
    stringMap.put("name", dto.getName());

    dto.setUserNum(JoinPage.userNumRan());
    if (dto.getUserNum() != null) {
      do {
        for (HashMap<String, String> map : list) {
          if (dto.getUserNum().equals(map.get("회원번호"))) {
            continue;
          }
        }
        break;
      } while (true);
      stringMap.put("회원번호", dto.getUserNum());
    }
    return stringMap;
  }
}

