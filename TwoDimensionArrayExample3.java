public class TwoDimensionArrayExample3 {
    private int[][] array;

    // Constructor to initialize the 2D array
    public TwoDimensionArrayExample3(int rows, int cols) {
        array = new int[rows][cols];
    }

    // Method to set a value at a specific position
    public void setElement(int row, int col, int value) {
        if (row >= 0 && row < array.length && col >= 0 && col < array[0].length) {
            array[row][col] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to get a value at a specific position
    public int getElement(int row, int col) {
        if (row >= 0 && row < array.length && col >= 0 && col < array[0].length) {
            return array[row][col];
        } else {
            System.out.println("Invalid index");
            return -1; // Return an invalid value
        }
    }

    // Method to calculate the sum of all elements in the array
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // Method to find the maximum element in the array
    public int findMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // Method to print the 2D array
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create an instance of the class
        TwoDimensionArrayExample3 example = new TwoDimensionArrayExample3(3, 3);

        // Set elements in the array
        example.setElement(0, 0, 1);
        example.setElement(0, 1, 2);
        example.setElement(0, 2, 3);
        example.setElement(1, 0, 4);
        example.setElement(1, 1, 5);
        example.setElement(1, 2, 6);
        example.setElement(2, 0, 7);
        example.setElement(2, 1, 8);
        example.setElement(2, 2, 9);

        // Print the array
        System.out.println("2D Array:");
        example.printArray();

        // Calculate and print the sum of all elements
        int sum = example.calculateSum();
        System.out.println("Sum of all elements: " + sum);

        // Find and print the maximum element
        int max = example.findMax();
        System.out.println("Maximum element: " + max);
    }
}