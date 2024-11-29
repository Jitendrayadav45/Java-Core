import java.util.Scanner;

public class PrimeNumbersInArray {
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

        // Find and count prime numbers
        int primeCount = 0;

        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primeCount++;
            }
        }

        // Output the count of prime numbers
        System.out.println("\nTotal prime numbers: " + primeCount);
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}