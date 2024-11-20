public class Patterne1 {
    public static void main(String[] args) {
        /*
         *    0 1 2 3 4
         *  0 * _ _ _ *
         *  1 * * * * *
         *  2 * * _ * *
         *  3 * * * * *
         *  4 * * * * *
         * 
         */

        int rows = 5;
        int cols = 5;

        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                
                if ( (j == 0 || j == cols - 1)) {
                    System.out.print("* ");
                } else if (i == 2 && j == 2) {
                    System.out.print("_ ");
                } else {
                    System.out.print("* ");
                }
            }
    
            System.out.println();
        }
    }
}
