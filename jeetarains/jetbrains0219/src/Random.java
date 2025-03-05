public class Random {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(new Random2().roll());
    }
  }

  public int nextlnt(int i) {
    return i;
  }
}

class Random2 {
  Random r = new Random();

  int roll() {
//    return (int) (Math.random() * 10 + 1);
    return r.nextlnt(6) + 1;
  }
}
