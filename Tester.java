import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(String.valueOf(ArrayOps.sum(arr)));
    System.out.println(String.valueOf(ArrayOps.largest(arr)));
    int[] arr2 = {5,5,5,5};
    System.out.println(String.valueOf(ArrayOps.sum(arr2)));
    System.out.println(String.valueOf(ArrayOps.largest(arr2)));
    int[][] arr3 = {{1},{100,10,1},{1,9,2,8,3,7,4,6,5,5}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr3)));
  }
}
