public class NumberTrianglePattern {
    public static void main(String[] args) {
        // Define the height of the triangle
        int height = 5;

        // Print the number triangle pattern
        for (int i = 1; i <= height; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}