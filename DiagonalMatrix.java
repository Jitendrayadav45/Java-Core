public class DiagonalMatrix {
    public static void main(String[] args) {
        // Initialize a 5x5 diagonal matrix
        int[][] matrix = {
            {1, 0, 0, 0, 0},
            {0, 2, 0, 0, 0},
            {0, 0, 3, 0, 0},
            {0, 0, 0, 4, 0},
            {0, 0, 0, 0, 5}
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