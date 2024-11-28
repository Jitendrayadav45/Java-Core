import java.util.Scanner;

public class ShiftOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int a = sc.nextInt(); // Read the integer input from the user

        // Perform left shift operation and display the result
        System.out.println("Left shift (a << 2): " + (a << 2));
        
        // Perform right shift operation and display the result
        System.out.println("Right shift (a >> 2): " + (a >> 2));
        
        // Perform unsigned right shift operation and display the result
        System.out.println("Unsigned right shift (a >>> 2): " + (a >>> 2));
        
        // Close the scanner
        sc.close();
    }
}