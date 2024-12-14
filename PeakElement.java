import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        int[] peak = findPeak(matrix);
        System.out.println("Peak Element: " + matrix[peak[0]][peak[1]]);
        System.out.println("Position: (" + peak[0] + ", " + peak[1] + ")");
        sc.close();
    }

    public static int[] findPeak(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int startCol = 0, endCol = cols - 1;

        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int maxRow = 0;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][midCol] > matrix[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            boolean leftIsSmaller = midCol == 0 || matrix[maxRow][midCol] > matrix[maxRow][midCol - 1];
            boolean rightIsSmaller = midCol == cols - 1 || matrix[maxRow][midCol] > matrix[maxRow][midCol + 1];

            if (leftIsSmaller && rightIsSmaller) {
                return new int[]{maxRow, midCol};
            } else if (!leftIsSmaller) {
                endCol = midCol - 1;
            } else {
                startCol = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
