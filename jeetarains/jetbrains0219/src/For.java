import java.util.Arrays;

public class For {

  public static void main(String[] args) {

    int[] arr = {2, 8, 4, 9, 3};
    int temp = 0;
//미니 알고리즘 테스트
    for (int i = 0; i <= 3; i++) {
      for (int j = i + 1; j <= 4; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
//      System.out.println(Arrays.toString(arr));

    }
    System.out.println(Arrays.toString(arr));
   
  }


}
