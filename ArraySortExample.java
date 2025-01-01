import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 3, 8, 1, 2, 7};
        
        // Print original array
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
