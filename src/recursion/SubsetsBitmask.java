package recursion;

public class SubsetsBitmask {

    public static void main(String[] args) {
        // The input array of numbers to find subsets of.
        int[] setOfNumbers = {1, 2, 3};
        generateSubsets(setOfNumbers);
    }

    /**
     * Generates and prints all subsets of the given set of numbers.
     * This method uses a bitmasking approach, where each integer from 0 to 2^n - 1
     * represents a unique subset.
     * @param setOfNumbers The input array of numbers.
     */
    public static void generateSubsets(int[] setOfNumbers) {
        // Get the number of elements in the input array.
        int numberOfElements = setOfNumbers.length;

        // The total number of subsets is 2^n, where n is the number of elements.
        // We can calculate this using the left shift operator: 1 << n is equivalent to 2^n.
        // For example, if n = 3, totalSubsets will be 1 << 3, which is 8.
        int totalSubsets = 1 << numberOfElements;

        // We loop from 0 to 2^n - 1. Each number in this range is a "mask" that
        // represents a unique subset.
        for (int subsetRepresentation = 0; subsetRepresentation < totalSubsets; subsetRepresentation++) {
            System.out.print("{ ");

            // For each subsetRepresentation, we check which elements from the original set are included.
            for (int i = 0; i < numberOfElements; i++) {
                // The core of the bitmasking approach.
                // (1 << i) creates a binary number with only the i-th bit set to 1.
                // For i=0, (1<<0) is ...001
                // For i=1, (1<<1) is ...010
                // For i=2, (1<<2) is ...100
                //
                // We then use the bitwise AND operator (&) with the subsetRepresentation.
                // If the i-th bit is set in subsetRepresentation, the result of the AND operation will be non-zero.
                // This means the i-th element of the set should be included in the current subset.
                //
                // Example: setOfNumbers = {1, 2, 3}, subsetRepresentation = 5 (binary 101)
                // i = 0: (5 & (1<<0)) -> (101 & 001) -> 001 (non-zero), so include setOfNumbers[0] (which is 1)
                // i = 1: (5 & (1<<1)) -> (101 & 010) -> 000 (zero), so exclude setOfNumbers[1] (which is 2)
                // i = 2: (5 & (1<<2)) -> (101 & 100) -> 100 (non-zero), so include setOfNumbers[2] (which is 3)
                // The resulting subset for subsetRepresentation 5 is {1, 3}.
                if ((subsetRepresentation & (1 << i)) != 0) {
                    System.out.print(setOfNumbers[i] + " ");
                }
            }
            System.out.println("}");
        }
    }

    //if still facing any issue check strivers video
}
