// Demonstration of recursive control flow with multiple recursive calls
// This example helps visualize how recursion works when a function calls itself more than once.
// Useful for understanding tree recursion and output order in such cases.
package recursion;

public class ControlFlow {
    // Entry point: starts the recursive process
    public static void main(String[] args) {
        // Start recursion with x = 0
        function(0);
    }

    // Recursive function that prints x, then makes two recursive calls
    // Each call increases x by 1 and by 2, respectively
    // Base case: when x >= 3, recursion stops
    public static void function(int x) {
        // Print current value of x before any recursive calls
        System.out.print(x + " ");
        // Base case: stop recursion when x reaches 3 or more
        if (x >= 3) {
            return;
        }
        // First recursive call: increment x by 1
        function(x + 1);
        // Second recursive call: increment x by 2
        function(x + 2);
        // Note: Output order is pre-order (print, then recurse)
        // This creates a tree-like flow of execution
    }
}
