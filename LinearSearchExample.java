/*
    Searching:
    1. linear
    2. binary

 */
public class LinearSearchExample
{
    public static void main(String[] args)
    {
        int[] values = { 3, 5, 6, 1, 8, 9, 4, 6 };
        int searchValue = 6;
        boolean searchValueFound = false;
        int searchAtIndex = -1;
        for(int i=0; i < values.length; i++)
        {
            if(searchValue == values[i])
            {
                searchAtIndex = i;
                searchValueFound = true;
                break;
            }
        }
        if(searchValueFound)
        {
            System.out.println(" value found at index  "+searchAtIndex);
        }
        else
        {
            System.out.println(" value not found ");
        }
    }
}