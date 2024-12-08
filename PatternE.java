public class PatternE {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the pattern
        int columns = 7; // Number of columns for the pattern

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Conditions for the "E" shape
                if (j == 0 || // Left vertical line
                    i == 0 || // Top horizontal line
                    i == rows / 2 || // Middle horizontal line
                    i == rows - 1) { // Bottom horizontal line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
