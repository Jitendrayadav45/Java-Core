import java.util.Scanner;

public class CountNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements (sorted):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Number of negative numbers: " + countNegatives(matrix));
        sc.close();
    }

    public static int countNegatives(int[][] matrix) {
        int count = 0;
        int rows = matrix.length, cols = matrix[0].length;
        int row = rows - 1, col = 0;

        while (row >= 0 && col < cols) {
            if (matrix[row][col] < 0) {
                count += (cols - col);
                row--;
            } else {
                col++;
            }
        }

        return count;
    }
}
