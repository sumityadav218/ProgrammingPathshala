package Arrays.Precomputation;

public class PrecomputeSample {

    public static int[] precompute(int[] arr) {
        int n = arr.length;
        int[] precomputed = new int[n];
        precomputed[0] = arr[0];

        for (int i = 1; i < n; i++) {
            precomputed[i] = precomputed[i - 1] + arr[i];
        }

        return precomputed;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = precompute(arr);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
