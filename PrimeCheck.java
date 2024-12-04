public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // You can change this value to test other numbers
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
