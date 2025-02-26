import java.util.Arrays;

public class For2 {

  public static void main(String[] args) {

    int[] arr = {2, 8, 4, 9, 3};
    int[] a1;
    int a2[];
    int x = 1;

    a1 = new int[arr.length];
    System.out.println(Arrays.toString(a1)); // Q1 이때 a 의 값 예상

    a1 = Arrays.copyOf(arr, arr.length);
    a1 = new int[]{1, 2, 3, 4};
    a1 = new int[]{5, 6, 7, 8};
    a1 = new int[]{5, 2, 9, 2};
    a2 = a1;
    System.out.println(Arrays.toString(a2)); // Q2 재할당 후 값 예상
    a1 = new int[]{20, 42, 99, 2};
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));

    System.out.println(Arrays.toString(a1) + (a1[x++] = 10)); // Q3 값변화
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(a2));


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
    }
//    System.out.println(Arrays.toString(arr));

  }


}
