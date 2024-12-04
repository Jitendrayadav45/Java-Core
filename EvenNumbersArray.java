import java.util.ArrayList;

public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArray = getEvenNumbers(originalArray);

        // Print the resulting even array
        System.out.print("Even numbers: ");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] getEvenNumbers(int[] array) {
        // Use an ArrayList to store even numbers dynamically
        ArrayList<Integer> evenList = new ArrayList<>();

        // Iterate through the original array and add even numbers to the list
        for (int num : array) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        // Convert the ArrayList back to an array
        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }

        return evenArray;
    }
}