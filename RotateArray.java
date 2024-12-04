import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;

        System.out.println("Original array: " + Arrays.toString(array));
        rotateArray(array, steps);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int steps) {
        int n = array.length;
        // Normalize steps to avoid unnecessary rotations
        steps = steps % n;

        // Reverse the whole array
        reverse(array, 0, n - 1);
        // Reverse the first 'steps' elements
        reverse(array, 0, steps - 1);
        // Reverse the rest of the array
        reverse(array, steps, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}