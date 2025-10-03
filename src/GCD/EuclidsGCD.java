package GCD;

import java.util.Scanner;

/**
 * This class demonstrates the calculation of the Greatest Common Divisor (GCD)
 * and Least Common Multiple (LCM) of two integers.
 */
public class EuclidsGCD {

    /**
     * The main method serves as the entry point for the program.
     * It defines two example numbers, calculates their GCD and LCM using helper methods,
     * and prints the results.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Example inputs. You can change these values to test with different numbers.
        int a = 52;
        int b = 10;

        // Calculate the GCD using the optimized Euclidean algorithm.
        int gcd = calculateGCD(a, b);

        // Calculate the LCM using the relationship between GCD and LCM.
        int lcm = calculateLCM(a, b, gcd);

        // Print the final results.
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers using Euclid's Algorithm.
     * This is a highly efficient, optimal method.
     * <p>
     * The algorithm works on the principle that gcd(a, b) is the same as gcd(b, a % b).
     * It repeatedly applies this property until the second number becomes 0.
     * The GCD is the non-zero number at that point.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int calculateGCD(int a, int b) {
        // The loop continues as long as the second number is not zero.
        while (b != 0) {
            // Store the second number in a temporary variable.
            int temp = b;
            // The new second number becomes the remainder of the first number divided by the second.
            b = a % b;
            // The new first number becomes the old second number (from the temp variable).
            a = temp;
        }
        // When the loop ends (b is 0), a holds the GCD.
        return a;
    }

    /**
     * Calculates the Least Common Multiple (LCM) of two numbers.
     * It uses the mathematical formula that connects LCM and GCD:
     * LCM(a, b) = (|a * b|) / GCD(a, b)
     *
     * @param a The first number.
     * @param b The second number.
     * @param gcd  The pre-calculated Greatest Common Divisor of a and b.
     * @return The LCM of a and b.
     */
    public static int calculateLCM(int a, int b, int gcd) {
        // To avoid potential integer overflow from (a * b),
        // it's safer to perform division first: (a / gcd) * b
        // However, for simplicity and given typical integer ranges, (a * b) / gcd is shown here.
        // The result must be positive, so we use Math.abs on the product.
        return Math.abs(a * b) / gcd;
    }
}
