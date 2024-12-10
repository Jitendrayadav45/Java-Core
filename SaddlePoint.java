import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            int minRowIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minRowIndex]) {
                    minRowIndex = j;
                }
            }

            boolean isSaddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][minRowIndex] > matrix[i][minRowIndex]) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle Point found at (" + i + ", " + minRowIndex + "): " + matrix[i][minRowIndex]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point found.");
        }

        sc.close();
    }
}
