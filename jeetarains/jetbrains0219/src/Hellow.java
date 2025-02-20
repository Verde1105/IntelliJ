public class Hellow {
//  psvm : 메인 클래스 생성 단축키
//  컨트롤 + f10 : 실행 단축키
//  컨트롤 + 쉬프트 + f 10 : 실행 할 클래스를 활성화 된 클래스로 바꾸는 단축키
  //컨트롤 + 알트 + v :

//  클래스와 인터페이스는 첫문자와 언더바 이후 두번째 단어 첫문자가 대문자
//  카멜은 머리는 작게 몸통은 크게
//  상수 = 리터럴은 전부 대문자 접두사로 final이 붙는다.
// int num = Integer.parseInt(변수명); : 형변환법 .뒤에는 변환할 타입 설정과 어떤 변수를 변환할것인지 명시.

  // import java.util.Scanner; : 기본적인 스캐너 클래스
// Scanner in = new Scanner(System.in); :  스캐너 클래스를 임포트 해 사용할때.
// int x = in.nextInt(); : 스캐너로 숫자를 받을때.
// String input = in.nextLine(); : 스캐너로 문자를 받을때. 이처럼 스캐너 변수명.받을 타입() 해주면 스캐너로 특정 형태의 값을 받을 수 있다.
  public static void main(String[] args) {
    String x = "a";

    if (x == "a") {
      System.out.println("a가 맞다");
    } else {
      System.out.println("ㅇㅇ?");
    }


    //fori : 기본 포문 작성
    //iter : 하단의 특정 조건문 생성. 이후 활성화된 클래스의 "에디트 콘퓨어런스" 클릭.
    for (String arg : args) {
      System.out.println(arg);
    }

  }
}
