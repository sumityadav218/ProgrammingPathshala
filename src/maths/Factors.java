package maths;

public class Factors {

    // very //very important statement
    //factors of N are symmertric about √N
    /*given  int n find all of its factors*/
        //brute force ---> run the loop till n/2
    public static void main(String[] args) {
        int N = 12;

        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
        //time complexity O(N )


        //OPTIMIZED VERSION USING THE STATEMENT MENTIONED ON TOP
            //CODE IS NOT CLEAN BUT GOOD TO UNDERSTAND THE FUNCTIONALITY
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println(i);      // print the smaller factor

                // Avoid printing duplicate when i*i == N (perfect square case)
                if (i != N / i) {
                    System.out.println(N / i);  // print the corresponding larger factor
                }
            }
        }


        //NEXT QUESTION FIND THE COUNT OF THE FACTORS PRESENT FOR GIVEN n are even or ODD
        //no need to calculate all the factors then counting it
        //if given value is perfect square means return odd
        //else return true


    }}
