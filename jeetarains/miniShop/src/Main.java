import java.util.*;

public class Main {
  static List<HashMap<String, String>> list = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UserDTO dto = new UserDTO();
    JoinPage jp = new JoinPage();
    String login = null;

    while (true) {
      if (login == null) {
        System.out.println("1. 신규가입 /" + "2. 마이페이지 /" + "3. 제품목록 /" + "4. 로그인 /" + "5. 종료하기");
      } else {
        System.out.println("1. 신규가입 /" + "2. 마이페이지 /" + "3. 제품목록 /" + "4. 로그아웃 /" + "5. 종료하기");
      }
      String i = sc.nextLine();

      switch (i) {
        case "1":
          list.add(jp.join());//최종적으로 맵의 값을 리스트에 담음(회원 한명분의 데이터)
          System.out.println("회원가입이 완료되었습니다.");
          continue;
        case "2":
          if (login != null) {
            System.out.println("1. 회원수정.");
            MyPage.myUpdate(list, login);
            System.out.println("2. 장바구니");
            System.out.println("3. 좋아요 목록");
            if (dto.getUserType().equals("seller")) {
              System.out.println("4. 제품등록");
            }
          } else {
            System.out.println("로그인한 사용자만 이용 가능한 페이지 입니다.");
            //          -장바구니목록
//          -좋아요목록
//          -제품등록, 수정, 내가올린제품목록, 등록된 제품삭제(판매자 회원일경우만)
          }
          continue;
        case "3":
          if (login != null) {
//          제품목록
//          -제품명 검색, 정렬기능
//          -장바구니 담기 기능
//          -좋아요 추가/삭제기능
          } else {
            System.out.println("로그인한 사용자만 이용 가능한 페이지 입니다.");
            continue;
          }
        case "4":
//          로그인구현
          if (login != null) {
            login = null;
            System.out.println("로그아웃하였습니다.");
            continue;
          }
          login = LoginPage.login(list);
          if (login == null) {
            System.out.println("로그인에 실패하였습니다. 홈으로 돌아갑니다.");
          }
          continue;
        default:
          System.out.println("잘못된 입력입니다. 다시 선택해 주십시오.");
          i = "";
          continue;

      }

//      hashSet(i);
// 구매자 회원가입 시스템
      //장바구니(추가,삭제)
      //

//<구현해야할것>
      //제품명 검색기능
      //좋아요 기능(좋아요 리스트 보이기 추가)
      //장바구니 기능

    }

  }

  public static void hashSet(String likeP) {
    Set<String> like = new HashSet<>();

    like.add(likeP);
    if (like.contains(likeP)) {
      like.remove(likeP);
      System.out.println("삭제되었습니다!");
    } else {
      like.add(likeP);
      System.out.println("추가되었습니다!");
    }
  }
}



