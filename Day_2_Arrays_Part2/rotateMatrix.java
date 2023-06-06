package Day_2_Arrays_Part2;
public class rotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Perform a series of four swaps
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // Store the top-left element
                int temp = matrix[i][j];

                // Move values from left to top
                matrix[i][j] = matrix[n - j - 1][i];

                // Move values from bottom to left
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];

                // Move values from right to bottom
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];

                // Assign the stored top-left element to right
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Another approach
 * public void rotate(int[][] matrix) {
 * int n = matrix.length;
 * 
 * // Step 1: Transpose the matrix
 * for (int i = 0; i < n; i++) {
 * for (int j = i; j < n; j++) {
 * int temp = matrix[i][j];
 * matrix[i][j] = matrix[j][i];
 * matrix[j][i] = temp;
 * }
 * }
 * 
 * // Step 2: Reverse each row of the transposed matrix
 * for (int i = 0; i < n; i++) {
 * int start = 0;
 * int end = n - 1;
 * while (start < end) {
 * int temp = matrix[i][start];
 * matrix[i][start] = matrix[i][end];
 * matrix[i][end] = temp;
 * start++;
 * end--;
 * }
 * }
 * }
 * 
 * 
 */