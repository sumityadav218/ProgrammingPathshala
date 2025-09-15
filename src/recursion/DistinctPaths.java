package recursion;

public class DistinctPaths {

    //this is a cpilot generated code and logic
    //they are also using a grid where m or n can be 1
    // Given m * n grid, find number of distinct paths from top left to bottom right
    // Constraint: you can only move down or right by 1 step at a time
    public static int distinctPaths(int m, int n) {
        // Base case: If either row or column is 1, only one path exists
        if (m == 1 || n == 1) {
            return 1;
        }
        // Recursive case: Sum of paths from cell above and cell to the left
        return distinctPaths(m - 1, n) + distinctPaths(m, n - 1);
        //you can check notes for clarity
        //n-1 and m-1 are the last columns
    }

    public static void main(String[] args) {
        // Example: 3x3 grid should return 6
        int m =3 , n = 3;
        System.out.println("Distinct paths in " + m + "x" + n + " grid: " + distinctPaths(m, n));
        // You can test with other values as well
    }
}
