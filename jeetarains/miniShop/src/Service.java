import java.util.HashMap;

public class Service {

  //유효성검사(중복체크)
//  public <T> validation(T data) {
//    T list;
//    if (data != null) {
//      do {
//        dto.set회원번호(JoinPage.번호());
//        for (HashMap<String, String> map : list) {
//          if (dto.get회원번호().equals(map.get("회원번호"))) {
//            continue;
//          }
//        }
//        break;
//      } while (true);
//      stringMap.put("회원번호", dto.get회원번호());
//    }
//    list.add(stringMap);//최종적으로 맵의 값을 리스트에 담음(회원 한명분의 데이터)
//    return list;
//  }

  //정리용 맵. 형태(키:" ", 값:Any)
  public static <S, T> HashMap hmList(S key, T value) {
    HashMap<S, T> map = new HashMap<>();
    map.put(key, value);
    return map;
  }
}
