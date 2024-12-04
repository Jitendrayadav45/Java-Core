public class MaxDifference {
    public static void main(String[] args) {
        int[] array = {2, 3, 10, 6, 4, 8};
        int maxDiff = findMaxDifference(array);

        System.out.println("Maximum difference is: " + maxDiff);
    }

    public static int findMaxDifference(int[] array) {
        if (array.length < 2) {
            // Not enough elements to find a difference
            return 0;
        }

        int minElement = array[0];
        int maxDiff = array[1] - array[0]; // Initialize with first possible difference

        for (int i = 1; i < array.length; i++) {
            // Update maxDiff if the current difference is greater
            if (array[i] - minElement > maxDiff) {
                maxDiff = array[i] - minElement;
            }

            // Update minElement if the current element is smaller
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        return maxDiff;
    }
}