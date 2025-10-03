package Arrays.Precomputation;

import java.util.Arrays;

/**
 * This class demonstrates the concept of a "Prefix Maximum" array.
 * A prefix maximum array is a precomputed array where each element at index 'i'
 * stores the maximum value found in the original array from index 0 up to 'i'.
 */
public class PreFixMax {

    /**
     * The main method to demonstrate the prefix maximum calculation.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // The original input array.
        int[] arr = {1, 5, 2, 8, 3, 6};

        // Calculate the prefix maximum array by calling the helper function.
        int[] prefixMax = calculatePrefixMax(arr);

        // Print the original and the resulting prefix maximum arrays for comparison.
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Max Array: " + Arrays.toString(prefixMax));
    }

    /**
     * Calculates the prefix maximum for a given integer array.
     * The time complexity is O(n) because we iterate through the array once.
     * The space complexity is O(n) because we create a new array to store the prefix maximums.
     *
     * @param arr The input integer array.
     * @return A new array containing the prefix maximums.
     */
    public static int[] calculatePrefixMax(int[] arr) {
        // Handle null or empty arrays as an edge case.
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        // Create a new array to store the prefix maximum values.
        int[] prefixMax = new int[n];

        // The first element of the prefix max array is always the first element of the original array,
        // as it's the maximum value in the subarray from index 0 to 0.
        prefixMax[0] = arr[0];

        // Iterate through the rest of the array starting from the second element (index 1).
        for (int i = 1; i < n; i++) {
            // The prefix maximum at the current index 'i' is the greater value between:
            // 1. The prefix maximum of the previous element (prefixMax[i-1]).
            // 2. The current element in the original array (arr[i]).
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        // Return the fully computed prefix maximum array.
        return prefixMax;
    }
}
