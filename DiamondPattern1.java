import java.util.Scanner;

public class DiamondPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the diamond pattern (must be odd)
        System.out.print("Enter the size of the pattern (odd number): ");
        int n = sc.nextInt();

        int rows = n; // Total rows

        // Generate the upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Generate the lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
