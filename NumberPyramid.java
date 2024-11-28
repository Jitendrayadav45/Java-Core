public class NumberPyramid {
    public static void main(String[] args) {

    // 1
   //1 2 
  // 1 2 3 
 // 1 2 3 4 
// 1 2 3 4 5 
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
