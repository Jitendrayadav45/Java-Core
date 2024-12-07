import java.util.Scanner;

public class AddTwo2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns for the arrays
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Initialize two 2D arrays and the resultant array
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] resultArray = new int[rows][cols];

        // Input elements for Array 1
        System.out.println("Enter elements for Array 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        // Input elements for Array 2
        System.out.println("Enter elements for Array 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        // Add the two arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Print the resultant array
        System.out.println("Resultant Array (Element-wise Addition):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
