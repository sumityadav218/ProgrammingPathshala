package maths;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*Amazing question on chessboard bishop functionality*/
public class WetShark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //n is the number of bishops
        int n = scanner.nextInt();
        //key is the diagonal identifier, value is the count of points on that diagonal
        Map<Integer, Integer> sumCounts = new HashMap<>();
        Map<Integer, Integer> diffCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            //x,y is the position of the bishop
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            //sum if for top right to bottom left diagonals
            //diff is for top left to bottom right diagonals
            int sum = x + y;
            int diff = x - y;

            sumCounts.put(sum, sumCounts.getOrDefault(sum, 0) + 1);
            diffCounts.put(diff, diffCounts.getOrDefault(diff, 0) + 1);
        }

        long totalPairs = 0;

        //only when there is 2 or more bishops on the same diagonal, we can form pairs
        for (int count : sumCounts.values()) {
            if (count > 1) {
                //count formula is kC2 = k*(k-1)/2 here k is count of the bishops on the same diagonal
                totalPairs += (long) count * (count - 1) / 2;
            }
        }

        for (int count : diffCounts.values()) {
            if (count > 1) {
                totalPairs += (long) count * (count - 1) / 2;
            }
        }

        System.out.println(totalPairs);
        scanner.close();
    }
}
