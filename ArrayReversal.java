import java.util.*;

public class ArrayReversal {
    public static void main(String[] args) {
        System.out.println("Initializing the array...");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Reversing the array...");
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
