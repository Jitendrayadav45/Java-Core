public class DivisibleBy4And5 {
    public static void main(String[] args) {
        // Array of numbers to check
        int[] numbers = {10, 20, 15, 16, 25, 30, 45, 50, 60};
        
        System.out.println("Checking divisibility by 4 and 5:");
        
        // Loop through the array
        for (int number : numbers) {
            // Check if the number is divisible by both 4 and 5
            if (number % 4 == 0 && number % 5 == 0) {
                System.out.println(number + " is divisible by both 4 and 5.");
            } 
            // Check if divisible by only 4
            else if (number % 4 == 0) {
                System.out.println(number + " is divisible by 4 only.");
            } 
            // Check if divisible by only 5
            else if (number % 5 == 0) {
                System.out.println(number + " is divisible by 5 only.");
            } 
            // Not divisible by 4 or 5
            else {
                System.out.println(number + " is not divisible by 4 or 5.");
            }
        }
    }
}
