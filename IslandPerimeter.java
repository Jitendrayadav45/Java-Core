import java.util.Scanner;

public class IslandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];
        System.out.println("Enter the grid elements (0/1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("Island Perimeter: " + calculatePerimeter(grid));
        sc.close();
    }

    public static int calculatePerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4; // Add 4 sides for each land cell

                    // Subtract sides shared with neighboring land cells
                    if (i > 0 && grid[i - 1][j] == 1) perimeter--;
                    if (j > 0 && grid[i][j - 1] == 1) perimeter--;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) perimeter--;
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) perimeter--;
                }
            }
        }

        return perimeter;
    }
}
