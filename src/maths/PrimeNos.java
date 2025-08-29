package maths;

public class PrimeNos {
    public static void main(String[] args) {

      /*
      //Check whether a given no is prime or not
      */
        int num = 29;
        int count = 0;
        //Starting from 2 since 1 is not a prime no.
        //i*i is a new way of iterating till √num we can also do it in using Math.sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Given Number = " + num + " is a prime No.");
        } else {
            System.out.println("Not Prime Number");
        }
        //--> time complexity : O(√N)
//---------------------------------------------------------------------------------------------------------------


        /* Question: Checking whether Check what numbers are prime in a given range */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //tell which of those numbers are prime

        //Brute-Force: Time-Complexity O(N*√M).

        // Loop through the numbers in the given range (from 2 to 20)
        for (int i = arr[1]; i <= arr[arr.length - 1]; i++) {
            int cout = 0;
            // Check if the current number i is divisible by any number from 2 up to √i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    cout++; // If divisible, increment cout (not a prime)
                    break; // No need to check further, i is not prime
                }
            }
            // If cout is still 0, then i is a prime number
            if (cout == 0) {
                System.out.println("Prime No in the given range = " + i);
            }
        }


//-------------------------------------------------------------------------------------------------------------------------


        //now the optimized approach is Sieve of Eratosthenes
        //Time Complexity : O(N log(log N))
        //Space Complexity : O(N)
        //drawback is it takes more space and suitable for range n < 10 million

        int range = 20;
        boolean[] prime = new boolean[range + 1];

        // Mark all numbers as prime initially
            for (int i = 0; i <= range; i++) {
            prime[i] = true;
        }

        // 0 and 1 are not prime numbers
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= range; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= range; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Print all primes in the range
        for (int i = 2; i <= range; i++) {
            if (prime[i]) {
                System.out.println("Prime number: " + i);
            }
        }

    }
}
