import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for Matrix A
        System.out.print("Enter the number of rows in Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter the number of columns in Matrix A (and rows in Matrix B): ");
        int colsA = sc.nextInt();

        // Input dimensions for Matrix B
        System.out.print("Enter the number of columns in Matrix B: ");
        int colsB = sc.nextInt();

        // Initialize Matrices A and B
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[colsA][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Input elements for Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input elements for Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
