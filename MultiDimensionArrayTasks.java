import java.util.Arrays;

public class MultiDimensionArrayTasks
{
    public static void main(String[] args)
    {
        int[][] array1 = new int[5][3];
        // Fill array1 with values
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i * 2 + 1; 
            }
        }

        //  1 1 1
        //  3 3 3
        //  5 5 5
        //  7 7 7
        //  9 9 9
        int[][] array2 = { {1,1,1}, {3,3,3}, {5,5,5} };
        
        // Print array1
        for(int i=0; i < array1.length; i++)
        {
            System.out.println(Arrays.toString(array1[i]));
        }
        
        System.out.println(" using enhanced for loop ");
        
        
        for(int[] innerArray : array2)
        {
            System.out.println(Arrays.toString(innerArray));
        }
    }
}