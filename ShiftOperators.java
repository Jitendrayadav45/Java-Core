import java.util.Scanner;

public class ShiftOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Left shift (a << 2): " + (a << 2));
        System.out.println("Right shift (a >> 2): " + (a >> 2));
        System.out.println("Unsigned right shift (a >>> 2): " + (a >>> 2));
    }
}
