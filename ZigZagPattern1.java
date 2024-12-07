import java.util.Scanner;

public class ZigZagPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Input elements of the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Print in zig-zag order
        System.out.println("Zig-Zag Pattern:");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                // Right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
