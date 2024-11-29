# Java-Core
================
### Java Core
#### Java Basics

1. Number Pyramid
Problem: Print the following number pyramid for n = 5:

markdown
Copy code
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
Code:
java
Copy code
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
2. Diamond Pattern
Problem: Print the following diamond pattern for n = 5:

markdown
Copy code
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
Code:
java
Copy code
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half

        // Top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
3. Checkerboard Pattern
Problem: Print the following checkerboard pattern for n = 5:

markdown
Copy code
* * * * *
 * * * * *
* * * * *
 * * * * *
* * * * *
Code:
java
Copy code
public class CheckerboardPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star based on row and column parity
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
4. Floyd’s Triangle
Problem: Print Floyd’s triangle for n = 5:

Copy code
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Code:
java
Copy code
public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number
            }
            System.out.println();
        }
    }
}
5. Zigzag Star Pattern
Problem: Print the following zigzag pattern for n = 9:

markdown
Copy code
   *       *
  * *     * *
 *   *   *   *
*     * *     *
Code:
java
Copy code
public class ZigzagPattern {
    public static void main(String[] args) {
        int n = 9; // Number of columns

        for (int i = 1; i <= 4; i++) { // 4 rows
            for (int j = 1; j <= n; j++) {
                // Check if star should be printed
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
6. Hollow Pyramid
Problem: Print a hollow pyramid for n = 5:

markdown
Copy code
    *
   * *
  *   *
 *     *
*********
Code:
java
Copy code
public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*   
