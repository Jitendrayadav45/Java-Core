import java.util.Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {
       
        int[] array1 = { 5, 9, 14, 16, 22, 26 }; // 6
        int[] array2 = new int[array1.length];
        //task 1: { 7, 12, 18, 21, 28, 33 };
        //task 2: { 7, 6, 18, 11, 28, 19 };
        //task 3: { 21, 13, 2 }
        int[] array3 = new int[array1.length/2];
        //task 4: { 11, 7, 2, 16, 38, 42 }
        int[] array4 = new int[array1.length];
        int counter = 2;
        for(int i = 0; i < array1.length ; i++)
        {
            if( i % 2 == 0)
            {
                array2[i] = array1[i] + counter;
            }
            else
            {
                array2[i] = array1[i] - counter;
            }
            counter++;
        }
        System.out.println("array1 = "+ Arrays.toString(array1));
        System.out.println("array2 = "+ Arrays.toString(array2));
        counter = 1;
        for(int i = 0 ; i < array3.length; i++)
        {
            array3[i] = array1[array1.length - (i + 1)] - array1[i];
            //array3[i] = array1[array1.length - (counter)] - array1[i];
            //counter++;
        }
        System.out.println("array3 = "+ Arrays.toString(array3));
        ///
        int midValue = array1[array1.length / 2];
        int midIndex = array1.length / 2;
        for(int i =0; i < array1.length; i++)
        {
            if( i < midIndex)
            {
                array4[i] = midValue - array1[i];
            }
            else if(i > midIndex)
            {
                array4[i] = midValue + array1[i];
            }
            else
            {
                array4[i] = array1[i];
            }
        }
        System.out.println("array4 = "+ Arrays.toString(array4));
        int[] array5 = { 0, 1, 0, 1, 8, 2, 3, 3, 4 };
        //  { 2, 2, 1, 2, 1, 0, 0, 0, 1 }
        int[] array6 = new int[array5.length];
    }
}

