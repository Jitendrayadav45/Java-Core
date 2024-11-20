import java.util.Arrays;

public class ArrayExample2
{
    public static void main(String[] args)
    {
        int[] array1 = { 10, 15, 18, 9, 11, 16};
        int difference = array1[1] - array1[0];
        int[] array2 = new int[6];
        // [ 5, 3, -9, 2, 5, -6 ]
        for(int i=0; i < array1.length; i++)
        {
            if(i < array1.length - 1)
            {
                // 0 = 15 - 10
                // 1 = 18 - 15
                // 2 = 9 - 18
                // 3 = 11 - 9
                // 4 = 16 - 11
                array2[i] = array1[i+1] - array1[i];
            }
            else
            {
                // 5 = 10 - 16
                array2[i] = array1[0] - array1[i];
            }
        }
        System.out.println(" array1 values = "+ Arrays.toString(array1));
        System.out.println(" array2 values = "+ Arrays.toString(array2));
    }
}