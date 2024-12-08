public class ArrayPattern {
    public static void main(String[] args) {
        // Define an array where each element represents the number of stars in that row
        int[] starPattern = {1, 3, 5, 7, 5, 3, 1};

        for (int i = 0; i < starPattern.length; i++) {
            // Print spaces to center-align the stars
            for (int j = 0; j < (starPattern.length - i - 1); j++) {
                System.out.print(" ");
            }
            // Print stars based on the value in the array
            for (int k = 0; k < starPattern[i]; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
