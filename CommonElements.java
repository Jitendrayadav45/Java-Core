import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find common elements
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int j = 0; j < cols; j++) {
            countMap.put(matrix[0][j], 1);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (countMap.containsKey(matrix[i][j]) && countMap.get(matrix[i][j]) == i) {
                    countMap.put(matrix[i][j], i + 1);
                }
            }
        }

        System.out.println("Common Elements:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == rows) {
                System.out.print(entry.getKey() + " ");
            }
        }

        sc.close();
    }
}
