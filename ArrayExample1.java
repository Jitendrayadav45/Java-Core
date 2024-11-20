import java.util.Arrays;

/*
        String  : null
        int     :  0
        double  :  0.0
        boolean : false
        float   :  0.0

 */


/*
    Array:
    1. collection of similar data types
    2. array is non-primitive
    3. fixed length, we can give length one time only, can't change length after initialize
    4. we can't give index less and above
    5. we can initialize array by 2 ways
        1. with length
        2. with values


 */

public class ArrayExample1
{
    public static void main(String[] args)
    {
        String name = "akash";
        String[] names = new String[5]; // default value of string: null
        System.out.println("names array length = "+names.length);
        // 0, 1, 2, 3, 4
        names[0] = "aman";
        //names[5] = "rohit";
        //names[-1] = "rohit";
        System.out.println(" names = "+names);
        System.out.println(" names in strings = "+ Arrays.toString(names));
        int[] rollNo = new int[5];
        System.out.println(" rollNo in strings = "+ Arrays.toString(rollNo));
        double[] percentage = new double[5];
        System.out.println(" percentage in strings = "+ Arrays.toString(percentage));
        ////
        names[1] = "sumit";
        names[2] = "rohit";
        names[3] = "sourabh";
        names[4] = "vijay";
        System.out.println(" names in strings = "+ Arrays.toString(names));
        System.out.println(" first index value of names "+names[1]);
        for(int i=0; i < names.length; i++)
        {
            System.out.println(" name = "+names[i]);
        }
        int index = 0;
        for (String value : names)
        {
            System.out.println(" name = " + value);
            index++;
        }

        String[] products = { "shoe", "shirt", "t-shirt", "jean" };// 4
        System.out.println("products array length = "+products.length);


        

        String section = "A";
        String[] sectionArray = new String[5];
        System.out.println("section array length = "+sectionArray.length);
        System.out.println("sectionArray reference = "+sectionArray);
        System.out.println("sectionArray values = "+Arrays.toString(sectionArray));

        
        

    }
}