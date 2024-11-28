import java.util.Scanner;

public class PatternExample1 {
    public static void main(String[] args) {
        /*
         *
         ***
         *****
         *******

         */
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for number of rows
        System.out.print("Enter the number of rows for the pattern: ");
        int n = scanner.nextInt();

        // Step 2: Loop for rows
        for (int i = 1; i <= n; i++) {
            // Step 3: Loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                // Step 4: Print star
                if (j <= i) {
                    System.out.print("*"); // Print star without new line
                } else {
                    System.out.print(" "); // (optional, add spaces for other patterns)
                }
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
