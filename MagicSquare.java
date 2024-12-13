import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Check if the matrix is a magic square
        if (isMagicSquare(matrix, n)) {
            System.out.println("The matrix is a Magic Square.");
        } else {
            System.out.println("The matrix is NOT a Magic Square.");
        }

        sc.close();
    }

    public static boolean isMagicSquare(int[][] matrix, int n) {
        int sumDiagonal1 = 0, sumDiagonal2 = 0;

        // Calculate the sum of the main diagonal
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            sumDiagonal2 += matrix[i][n - i - 1];
        }

        // If diagonals' sums are not equal, it's not a magic square
        if (sumDiagonal1 != sumDiagonal2) {
            return false;
        }

        // Check sums of all rows and columns
        for (int i = 0; i < n; i++) {
            int sumRow = 0, sumCol = 0;

            for (int j = 0; j < n; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];
            }

            // If any row or column sum is not equal to diagonal sum, return false
            if (sumRow != sumDiagonal1 || sumCol != sumDiagonal1) {
                return false;
            }
        }

        // If all checks passed, it's a magic square
        return true;
    }
}
