public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public static int[] sumRows (int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] = sum(matrix[i]);
    }
    return ans;
  }
  public static  int[] largestInRows(int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] = largest(matrix[i]);
    }
    return ans;
  }
  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }
  public static int[] sumCols(int[][] matrix) {
    if (matrix.length == 0) {
      int[] ans = {};
      return ans;
    }
    int[][] mat = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        mat[j][i] = matrix[i][j];
      }
    }
    return sumRows(mat);
  }
}
