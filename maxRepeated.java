
// / task 5
//         int [] array3 = { 1, 2, 5, 3, 5, 2, 3, 5 };
//         // found max repeated value
//         int maxRepeated = findMaxRepeated(array3);

 
public class maxRepeated {
    public static void main(String[] args) {
        // Task 5: Example array
        int[] array3 = {1, 2, 5, 3, 5, 2, 3, 5};

        // Find the maximum repeated value
        int maxRepeated = findMaxRepeated(array3);
        System.out.println("The maximum repeated value is: " + maxRepeated);
    }

    public static int findMaxRepeated(int[] array) {
        int maxCount = 0; // Store the highest frequency
        int maxValue = array[0]; // Store the most repeated value

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            // Count occurrences of array[i]
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            // Update maxCount and maxValue if a higher frequency is found
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue; // Return the value with the maximum count
    }
}


///// JItendra Yadav