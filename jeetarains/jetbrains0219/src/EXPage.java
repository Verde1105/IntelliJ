

public class EXPage {
  public static void main(String[] args) {

    Magic me = new Magic();
    me.main();


    partyCostume me1 = new partyCostume();
    me1.character("자이언트");
    me1.character(10);
  }
}

class MagicFamily {
  void fireMagic() {
    System.out.println("진행도 50% 마술");
  }
}

class FirstSon extends MagicFamily {
  @Override
  void fireMagic() {
    System.out.println("진행도 80% 마술");
  }

  void anotherMagic() {
    System.out.println("새 마술");
  }

  int anotherMagic(int magic) {
    System.out.println(" 새로 만든 불마술");
    return magic;
  }
  void anotherMagic(String magic, int anotherMagic) {
    System.out.println(" 새로 만든 마술");
  }
}

class FirstSonAndSon extends FirstSon {
  @Override
  void fireMagic() {
    System.out.println("진행도 90% 마술");
  }
}

class SecondSon extends MagicFamily {
  @Override
  void fireMagic() {
    System.out.println("진행도 60% 마술");
  }
  void another() {
    System.out.println("검술");
  }
  int another(int magic) {
    System.out.println(" 격투술");
    return magic;
  }
  void another(String another1, int another2) {
    int gun = another2;
    System.out.println(" Gun 법");
    System.out.println(another1.repeat(gun));
  }
}

class Magic {
  public static void main() {
    //본인형식으로  본인 부르기
    MagicFamily 원래마술 = new MagicFamily();
    원래마술.fireMagic();

    //오버라이딩
    원래마술.fireMagic();
    FirstSonAndSon fs = new FirstSonAndSon();
    fs.fireMagic();

//오버로딩
    FirstSon first = new FirstSon();
    first.anotherMagic();
    first.anotherMagic(2);
    first.anotherMagic("", 10);

    //업캐스팅
    MagicFamily f = new FirstSon();
    f.fireMagic();

    //다운캐스팅
    SecondSon s = (SecondSon) 원래마술;
//    s.fireMagic();
//    s.another("탕!", 5);
//    s.another();
//    s.another(20);

  }
}


//        인터페이스
interface DLC {
  void dress();
  void car();
//  void food();
}
class partyCostume implements DLC {
  //제네릭
  public <T> void character(T value) {
    System.out.println("종족" + value);
  }
  //    추상클래스
  @Override
  public void dress() {
    System.out.println("의상 디자인");
  }
@Override
public void car() {
  System.out.println("므료탈것");
}

}
