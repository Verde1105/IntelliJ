import java.util.Scanner;

public class TextGame extends GameDTO {
// 저장슬롯만들기
// 종족이 다르면 전투 가능하도록
// 아레나모드, 스토리모드
// 저장된 종족 중 랜덤값을 불러와 유저의 전적으로 오프라인 대전 가능하게끔.

  //스토리모드일때는 스크립트를 확률별로 만들어도 좋을듯


  //이하 스토리

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//    RandomGenerator random = new RandomGenerator;
    GameDTO character = GameDTO.getInstance();
    String storeNum = "";
    String userInput = scan.nextLine();


    System.out.println("캐릭터 이름을 입력해주세요!");
    character.setName(scan.nextLine());
    while (true) {
      System.out.println("캐릭터를 생성하겠습니다");
      switch (userInput) {
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
      }
      break;
    }
  }

}
