import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        // Create the main triangle list
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop to generate each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(); // Create a new row

            // Loop to fill each element of the row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements of each row are always 1
                } else {
                    // Add sum of two elements from the previous row
                    int sum = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(sum);
                }
            }

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5; // Example input
        List<List<Integer>> result = generate(numRows);

        // Print the triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
