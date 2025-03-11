import java.util.*;

public class Main {
  //TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
  public static <T> void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String i = sc.nextLine();
    UserDTO dto = new UserDTO();

    List<HashMap<String, String>> list = new ArrayList<>();
    while (true) {
      switch (i) {
        case "1":
//          이하 회원가입
          System.out.println("아이디를 입력해주세요");
          dto.setId(sc.nextLine());
          HashMap<String, String> stringMap = JoinPage.main("id", dto.getId());

          System.out.println("비밀번호를 입력해주세요");
          dto.setPw(sc.nextLine());
          stringMap.put("pw", dto.getPw());

          System.out.println("사용하실 이름을 입력해주세요");
          dto.setName(sc.nextLine());
          stringMap.put("name", dto.getName());

//          이하 회원번호생성
          if (dto.get회원번호() != null) {
            do {
              dto.set회원번호(JoinPage.번호());
              for (HashMap<String, String> map : list) {
                if (dto.get회원번호().equals(map.get("회원번호"))) {
                  continue;
                }
              }
              break;
            } while (true);
            stringMap.put("회원번호", dto.get회원번호());
          }
          list.add(stringMap);//최종적으로 맵의 값을 리스트에 담음(회원 한명분의 데이터)

          System.out.println(stringMap);
          System.out.println(list);

        case "2":
          System.out.println("이곳에서는 회원 정보를 수정할수 있습니다. 수정하시겠습니까?");
//          마이페이지
//          -회원수정
          System.out.println("회원번호" + dto.get회원번호());
          System.out.println("name" + dto.getName() + "님");
          System.out.println("id" + dto.getId());
          System.out.println("pw" + dto.getPw());
          switch (i) {
            case "1":
              System.out.println("회원번호는 수정 하실 수 없습니다.");
            case "2":
              System.out.println("id를 변경하시겠습니까? 지금 id" + dto.getId());
//등록된것들 중 동일값이 없다면 변경
            case "3":
              System.out.println("pw를 변경하시겠습니까?");
//              지금 pw와 동일하면 변경 가능하게
            case "4":
              System.out.println("닉네임을 변경하시겠습니까? 지금 닉네임" + dto.getName());
//제약없이 변경가능
              break;
          }
//          -장바구니목록
//          -좋아요목록
//          -제품등록, 수정, 내가올린제품목록, 등록된 제품삭제(판매자 회원일경우만)
        case "3":
          if (dto.get회원번호() != null) {
//          제품목록
//          -제품명 검색, 정렬기능
//          -장바구니 담기 기능
//          -좋아요 추가/삭제기능
          } else {
            System.out.println("로그인한 사용자만 이용 가능한 페이지 입니다.");
            continue;
          }
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



