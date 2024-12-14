import java.util.Scanner;

public class MedianMatrix {
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

        System.out.println("Median of the matrix: " + findMedian(matrix));
        sc.close();
    }

    public static int findMedian(int[][] matrix) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][cols - 1]);
        }

        int desired = (rows * cols + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                count += countSmallerThanMid(matrix[i], mid);
            }

            if (count < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }

    public static int countSmallerThanMid(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
