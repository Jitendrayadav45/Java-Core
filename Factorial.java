public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change to calculate factorial of another number
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial with each number
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
