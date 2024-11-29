import java.util.Scanner;

public class ReverseArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Check if the size is valid
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        // Initialize the array
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reverse the array
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = numbers[size - 1 - i];
        }

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}