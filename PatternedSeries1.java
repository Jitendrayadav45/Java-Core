public class PatternedSeries1 {

        public static void main(String[] args)
        {
            // 1, 3, 6, 10, 15, 13, 10, 6, 1
    
            // print below series
            // 1,
            // 4, 7, 10,
            // 14, 18, 22, 26,
            // 31, 36, 41, 46, 51
            // 57, 63, 69, 75, 81, 87
    
            int start = 1;
            int increment = 3;
            int count = 1;
            System.out.print(start); //1
            for(int i = 1; i <= 12; i++)
            /*
             * for loop i=1 then loop enter and if else condition check so if condition is true count<=incerment so start=start+incrmet
             * then for lop is i=2 then loop enter and if else condition check so if condition is true count<=incerment so start=start+incrmet
             * then for lop is i=3 then loop enter and if else condition check so if condition is true count<=incerment so start=start+incrmet

             ..... and so on 
             
             */
            {
                if(count <= increment) // 1, 4, 7, 10, 18, 22, 26, 30
                {
                    start = start + increment;
                    count++;
                }
                else
                {
                    count = 2;
                    increment++;
                    start = start + increment; // 14
                }
                System.out.print(", "+start);
            }
    
        }
    }