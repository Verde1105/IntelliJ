public class IfQ {

  public static void main(String[] args) {
    //아마 이걸 만들고 싶었던거 같은데
    int a = 0;
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0) {
        a += i;
        System.out.println(a + "아마 여기서는 i가 더해질때마다 순차적으로 더해지는게보이겠지");
      }
      System.out.println(a + "아마 여기서는 i를 3으로 나눴을때 나머지가 0이 아닐경우 값이 더해지지 않는 모습이 보일꺼고");
    }
    System.out.println(a);
  }
}