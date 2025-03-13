import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MyPage {
  //          마이페이지
  public static void myUpdate(List<HashMap<String, String>> list, String login) {
    UserDTO dto = new UserDTO();
    Scanner sc = new Scanner(System.in);

//          -회원수정
    System.out.println("이곳에서는 회원 정보를 수정할수 있습니다. 수정하시겠습니까?");

    for (HashMap<String, String> map : list) {
      //로그인 기능 만들어서 로그인된 아이디와 번호가 같다다면 이벤트
      if (login.equals(map.get("회원번호"))) {


        while (true) {
          System.out.println("회원번호 :" + map.get("회원번호"));
          System.out.println("name :" + map.get("name") + "님");
          System.out.println("id :" + map.get("id"));
          System.out.println("pw :" + map.get("pw"));

          System.out.println("1. id 변경 /" + "2. pw 변경 /" + "3. 닉네임변경 /" + "4. 홈으로 돌아가기");
          String i = sc.nextLine();

          switch (i) {
            case "1":
              System.out.println("id를 변경하시겠습니까? 지금 id : " + map.get("id"));

//등록된것들 중 동일값이 없다면 변경
              break;
            case "2":
              System.out.println("pw를 변경하시겠습니까?");
//              pw 동일여부 확인(지금비밀번호 입력,이후 바꿀 비밀번호 입력)
              break;
            case "3":
              System.out.println("닉네임을 변경하시겠습니까? 지금 닉네임 : " + map.get("name"));
              System.out.print("변경할 닉네임 : ");
              String userI = sc.nextLine();
              map.replace("name", map.get("name"));
              map.put("name", userI);
              break;
            case "4":
              System.out.println("메인으로 이동합니다.");
              break;
            default:
              System.out.println("잘못된 입력입니다. 다시 선택해 주십시오.");
          }
        }
      }
    }

//          -장바구니목록
//          -좋아요목록
//          -제품등록, 수정, 내가올린제품목록, 등록된 제품삭제(판매자 회원일경우만)

  }


}
