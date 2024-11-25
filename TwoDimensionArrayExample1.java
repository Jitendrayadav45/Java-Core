public class TwoDimensionArrayExample1
{
    public static void main(String[] args)
    {
        int[] number1 = new int[5];
        int[] number2 = { 2, 4, 3, 5, 1 };

        for(int i = 0; i < number2.length; i++)
        {
            int value = number2[i];
            //System.out.println(" value = "+value);
        }

        int[][] twoDArr2 = { {2, 5, 4, 1}, { 3, 7, 4, 1}, { 2, 5, 6, 3 }  }; // 3 * 4
        System.out.println(" twoDArr2 length "+twoDArr2.length); // 3
        System.out.println(" twoDArr2[0] length "+twoDArr2[0].length); // 4
        for(int i=0; i < twoDArr2.length; i++)
        {
            System.out.println(" row "+i);
            int[] innerArray = twoDArr2[i];
            for(int j=0; j < innerArray.length; j++)
            {
                System.out.print(" col value "+innerArray[j]);
            }
            System.out.println();
        }
        int[][] twoDArr1 = new int[2][5];
        // 0 index row
        twoDArr1[0][0] = 2;
        twoDArr1[0][1] = 4;
        twoDArr1[0][2] = 3;
        twoDArr1[0][3] = 5;
        twoDArr1[0][4] = 7;
        // 1 index row
        twoDArr1[1][0] = 4;
        twoDArr1[1][1] = 1;
        twoDArr1[1][2] = 5;
        twoDArr1[1][3] = 8;
        twoDArr1[1][4] = 3;
        System.out.println(twoDArr1);         
    }
}