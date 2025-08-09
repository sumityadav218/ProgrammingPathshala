package GCD;

import java.util.Scanner;

public class EuclidsGCD {
    public static void main(String[] args) {
        //this is the most optimal GCD approach
        //if dont know what is happening see programming pathshala GCD video
        Scanner sc = new Scanner(System.in);

        // Example inputs
        int a = 5;
        int b = 10;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // Euclid's algorithm to find GCD
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }

        int GCD = max;

        //Extra part to calculate LCM on the Fly
        int LCM = (a * b) / GCD;

        System.out.println(GCD + " " + LCM);

    }
}
