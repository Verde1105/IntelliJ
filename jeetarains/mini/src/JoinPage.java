import java.util.HashMap;

public class JoinPage {
  public static <T, Tt> HashMap<T, Tt> main(T key, Tt value) {
    HashMap<T, Tt> map = new HashMap<>();
    map.put(key, value);
    return map;
  }

  public static String 번호() {
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
}
