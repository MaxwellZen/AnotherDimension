public class Tester {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(String.valueOf(ArrayOps.sum(arr)));
    System.out.println(String.valueOf(ArrayOps.largest(arr)));
    int[] arr2 = {5,5,5,5};
    System.out.println(String.valueOf(ArrayOps.sum(arr2)));
    System.out.println(String.valueOf(ArrayOps.largest(arr2)));
  }
}
