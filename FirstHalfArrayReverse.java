import java.util.Arrays;

public class FirstHalfArrayReverse {

    public static void main(String[] args)
    {
        int[] values = { 1, 5, 3, 7, 4, 9 };

        // task 3 half reverse
        // output: { 9, 4, 7, 1, 5, 3 }
     int[] array1 = new int[values.length];
        int midIndex = array1.length / 2;
         //int index = 0;
        for(int i=0; i < values.length; i++)
        {
            if(i < midIndex)
            {
                array1[i] = values[values.length - (i + 1)];
                //{ 9, 4, 7, 0, 0, 0 }
            }
            else
            {
                // 3 - 3
                // 3 - 4
                // 3 - 5
                // approach 1
                /*
                array1[i] = values[index];
                index++;
                */
                // approach 2
                array1[i] = values[i - midIndex];
                //{ 9, 4, 7, 0, 0, 0 }
            }
        }
        System.out.println(" array1 "+ Arrays.toString(array1));

     
        
    }
}
