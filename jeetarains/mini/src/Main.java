import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
  public static <T> void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String i = sc.nextLine();
    String id = "";
    String pw = "";
    String name = "";
    String 회원번호 = "";

    List<HashMap<String, String>> list = new ArrayList<>();
    while (true) {
      switch (i) {
        case "1":
//          이하 회원가입
          System.out.println("아이디를 입력해주세요");
          id = sc.nextLine();
          HashMap<String, String> stringMap = JoinPage.main("id", id);

          System.out.println("비밀번호를 입력해주세요");
          pw = sc.nextLine();
          stringMap.put("pw", pw);

          System.out.println("사용하실 이름을 입력해주세요");
          name = sc.nextLine();
          stringMap.put("name", name);

//          이하 회원번호생성
          회원번호 = JoinPage.번호();
//          회원번호 = "000-054-096189";
//          stringMap.put("회원번호", 회원번호);
          if (회원번호 != null) {
            list.add(stringMap);//최종적으로 맵의 값을 리스트에 담음(회원 한명분의 데이터)
            for (HashMap<String, String> map : list) {
              if (map.containsKey("회원번호")) {
//              System.out.println(map.get("회원번호") + "!!!");
                for (map.get("회원번호").equals(회원번호); ; ) {
//                System.out.println("중복!" + 회원번호);
                  회원번호 = JoinPage.번호();
//                System.out.println("새 번호" + 회원번호);
                  break;
                }
              }
              stringMap.put("회원번호", 회원번호);
              break;
            }
          }

          list.add(stringMap);//최종적으로 맵의 값을 리스트에 담음(회원 한명분의 데이터)

          System.out.println(stringMap);
          System.out.println(list);

        case "2":
//          마이페이지
//          -회원수정
//          -장바구니목록
//          -좋아요목록
//          -제품등록, 수정, 내가올린제품목록, 등록된 제품삭제(판매자 회원일경우만)
        case "3":
//          제품목록
//          -제품명 검색, 정렬기능
//          -장바구니 담기 기능
//          -좋아요 추가/삭제기능
        case "4":
//
      }
      ;


//      hashSet(i);

//<구현해야할것>
      //제품명 검색기능
      //좋아요 기능(좋아요 리스트 보이기 추가)
      //장바구니 기능

    }

    //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
    // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
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