public class TwoDimensionArrayExample2 {
    
public int[][] array;

    // Constructor to initialize the 2D array with given rows and columns
    public TwoDimensionArrayExample2(int rows, int cols) {
        array = new int[rows][cols];
    }

    // Method to fill the array with values
    public void fillArray(int[][] values) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = values[i][j];
            }
        }
    }

    // Method to print the array
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class
        TwoDimensionArrayExample2 example = new TwoDimensionArrayExample2(3, 3);

        // Define values to fill the array
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Fill and print the array
        example.fillArray(values);
        System.out.println("The 2D array is:");
        example.printArray();
    }
}

