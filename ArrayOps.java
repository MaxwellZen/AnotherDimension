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
    int[] ans = new int[matrix[0].length];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = colSum(matrix, i);
    }
    return ans;
  }

  public static boolean isRowMagic(int[][] matrix) {
    for (int i = 0; i < matrix.length - 1; i++) {
      if (sum(matrix[i]) != sum(matrix[i+1])) {
        return false;
      }
    }
    return true;
  }

  public static int colSum(int[][] matrix, int col) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][col];
    }
    return sum;
  }

  public static boolean isColMagic(int[][] matrix) {
    if (matrix.length == 0) return true;
    for (int i = 0; i < matrix[0].length - 1; i++) {
      if (colSum(matrix, i) != colSum(matrix, i+1)) {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return sum(matrix[row]) == colSum(matrix, col);
  }
  
}
