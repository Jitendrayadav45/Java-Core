import java.util.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        System.out.println("Initializing the array...");
        int[] array = {23, 1, 45, 90, 2, 8, 67, 34, 12, 100};
        
        System.out.println("Finding the maximum and minimum elements...");
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
