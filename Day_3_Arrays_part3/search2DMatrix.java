package Day_3_Arrays_part3;

public class search2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}

/** another approach
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class Solution {
 * public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
 * ArrayList<Integer> result = new ArrayList<>();
 * 
 * if (arr == null || arr.size() == 0) {
 * return result;
 * }
 * 
 * int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
 * 
 * // Step 1: Find the potential majority elements
 * for (int num : arr) {
 * if (num == num1) {
 * count1++;
 * } else if (num == num2) {
 * count2++;
 * } else if (count1 == 0) {
 * num1 = num;
 * count1 = 1;
 * } else if (count2 == 0) {
 * num2 = num;
 * count2 = 1;
 * } else {
 * count1--;
 * count2--;
 * }
 * }
 * 
 * // Step 2: Verify the potential majority elements
 * count1 = 0;
 * count2 = 0;
 * for (int num : arr) {
 * if (num == num1) {
 * count1++;
 * } else if (num == num2) {
 * count2++;
 * }
 * }
 * 
 * if (count1 > arr.size() / 3) {
 * result.add(num1);
 * }
 * 
 * if (count2 > arr.size() / 3) {
 * result.add(num2);
 * }
 * 
 * return result;
 * }
 * }
 */