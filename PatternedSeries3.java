public class PatternedSeries3 {
    
    public static void main(String[] args) {
        
        // 1, 2, 3, 4, 3, 2, 1,
        // 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1

                int maxNumber = 4;
        
                for (int i = 1; i <= maxNumber * 2 - 1; i++) {
                    int value;
                    if (i <= maxNumber) // i=1 maxnumber=4 true 
                    {
                        value = i;
                    } else {
                        value = maxNumber * 2 - i;// value 4// maxnumber
                        
                    }
        
                    System.out.print("  " +value);
        
                }
            }
        
        }
        
