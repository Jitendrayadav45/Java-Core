public class CustomMatrix {
    public static void main(String[] args) {
        // Initialize the matrix
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {2, 0, 0, 0, 4},
            {3, 0, 0, 0, 3},
            {4, 0, 0, 0, 2},
            {5, 4, 3, 2, 1}
        };

        // Print the matrix
        printMatrix(matrix);
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}