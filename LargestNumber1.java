public class LargestNumber1 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 15, 6};
        int largest = numbers[0]; // Assume the first number is the largest

        for (int number : numbers) {
            if (number > largest) {
                largest = number; // Update largest if a bigger number is found
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
