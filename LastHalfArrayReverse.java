import java.util.Arrays;

public class LastHalfArrayReverse {
    public static void main(String[] args) {
        // Original input array
        int[] values = {1, 5, 3, 7, 4, 9};
        // output: { 3, 5, 1, 7, 4, 9 }

        // Calculate the midpoint index
        int midIndex = values.length / 2;

        // Create a new array to hold the result
        int[] modifiedArray = new int[values.length];

        // Fill the new array
        for (int i = 0; i < values.length; i++) {
            if (i < midIndex) {
                // Reverse the first half
                modifiedArray[i] = values[midIndex - (i + 1)];
            } else {
                // Keep the second half unchanged
                modifiedArray[i] = values[i];
            }
        }

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));
    }
}