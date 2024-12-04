public class PalindromeCheck {
    public static void main(String[] args) {
        int[] numbers = {121, 123, 343, 454, 111};
        
        for (int number : numbers) {
            int original = number;
            int reversed = 0;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }
}
