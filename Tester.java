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
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr3)));
    System.out.println(ArrayOps.sum(arr3));
    int[][]  arr4 = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr4)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr4)));
    System.out.println(ArrayOps.sum(arr4));
    System.out.println( Arrays.toString(ArrayOps.sumCols(arr4)));
    int[][] arr5 = { {  1,  2, 3, 4 },
    {  2, 3,  4,  1 },
    { 3, 4,  1, 2 } };
    System.out.println(ArrayOps.isRowMagic(arr5));
    System.out.println(ArrayOps.isColMagic(arr5));
    int[][] arr6 = { {  1,  1, 1 },
    {  2, 2, 2 },
    { 3,  3, 3 } };
    System.out.println(ArrayOps.isRowMagic(arr6));
    System.out.println(ArrayOps.isColMagic(arr6));
    int[][]E = {
    {  2,  4, 2 },
    {  2, 2, 2 } };
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
  }
}
