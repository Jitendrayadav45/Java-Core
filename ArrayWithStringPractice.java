import java.util.Arrays;

public class ArrayWithStringPractice
{
    public static void main(String[] args)
    {
        // non-primitive
        String name = "ABCDABA";
        System.out.println("name string length "+name.length());
        char[] nameArray = name.toCharArray();
        System.out.println(" nameArray = "+ Arrays.toString(nameArray));
        String searchString = "a";
        int searchStringCount = 0;
        for(char value : nameArray)
        {
            if(searchString.equalsIgnoreCase(String.valueOf(value)))
            {
                searchStringCount++;
            }
        }
        System.out.println(" searchStringCount = "+searchStringCount);
        String value = "45";
        char[] values = value.toCharArray();
        System.out.println(" values array "+Arrays.toString(values));
        int no1 = Integer.parseInt(value);
        System.out.println("no1 = "+no1);
    }
}