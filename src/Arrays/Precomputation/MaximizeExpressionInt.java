package Arrays.Precomputation;
public class MaximizeExpressionInt {
    /**
     * Finds the maximum value of the expression: p*arr[i] + q*arr[j] + r*arr[k]
     * where i < j < k, using int (not long), and correct iteration for j.
     */
    public static int maximizeExpression(int[] arr, int p, int q, int r) {
        int n = arr.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        // Compute prefixMax[i] = max value of p*arr[i] for all i <= j
        prefixMax[0] = p * arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], p * arr[i]);
        }

        // Compute suffixMax[k] = max value of r*arr[k] for all k >= j
        suffixMax[n - 1] = r * arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], r * arr[i]);
        }

        int maxValue = Integer.MIN_VALUE;
        // j from 1 to n-2 to ensure i < j < k
        for (int j = 1; j <= n - 2; j++) {
            int current = prefixMax[j - 1] + q * arr[j] + suffixMax[j + 1];
            maxValue = Math.max(maxValue, current);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int p = 1, q = 2, r = 3;
        System.out.println("Max value: " + maximizeExpression(arr, p, q, r));
    }
}