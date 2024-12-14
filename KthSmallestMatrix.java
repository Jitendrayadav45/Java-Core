import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestMatrix {
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

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Kth Smallest Element: " + findKthSmallest(matrix, k));
        sc.close();
    }

    public static int findKthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < matrix.length; i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0});
        }

        while (--k > 0) {
            int[] top = minHeap.poll();
            int row = top[1], col = top[2];

            if (col + 1 < matrix[0].length) {
                minHeap.offer(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }

        return minHeap.poll()[0];
    }
}
