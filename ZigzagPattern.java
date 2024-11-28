public class ZigzagPattern {
    public static void main(String[] args) {
        int n = 9; // Number of columns

        for (int i = 1; i <= 4; i++) { // 4 rows
            for (int j = 1; j <= n; j++) {
                // Check if star should be printed
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
