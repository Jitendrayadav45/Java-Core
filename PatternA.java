public class PatternA {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the pattern

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows; j++) {
                // Conditions for the "A" shape
                if ((j == 0 || j == rows) && i != 0 || // Left and right vertical bars
                    i == 0 && j > 0 && j < rows ||    // Top horizontal bar
                    i == rows / 2) {                 // Middle horizontal bar
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
