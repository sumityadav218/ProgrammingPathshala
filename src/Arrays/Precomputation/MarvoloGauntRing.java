package Arrays.Precomputation;


import java.util.Scanner;

public class MarvoloGauntRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //taking inputs from the console
        System.out.println("enter the size of array:");
        int n = sc.nextInt() ;
        System.out.println("enter value of p:");
        long p =sc.nextLong() ;
        System.out.println("enter value of q");
        long q = sc.nextLong() ;
        System.out.println("enter value of r:");
        long r = sc.nextLong()  ;
        int[] arr =  new int[n] ;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the input array:");
            arr[i] = sc.nextInt() ;
        }

        //precomputation of prefix sum array
        long[] prefixSum = new long [n] ;
        prefixSum[0] = p*arr[0] ;
        for (int i = 1 ; i< n ;i++){
            prefixSum[i]= Math.max(prefixSum[i-1],p*arr[i]) ;
        }

        //precomputation of suffix sum arrray
        long[] suffixSum =  new long[n] ;
        suffixSum[n-1] = r*arr[n-1] ;
        for (int i = n-2 ; i>=0 ;i--){
            suffixSum[i]= Math.max(suffixSum[i+1],r*arr[i]) ;
        }

        //final step to calculate the maximum value
        long result = Long.MIN_VALUE ;
        System.out.println("Maximum result is : ");
        for (int i = 0 ; i < n ;i++){
            result = Math.max(result, prefixSum[i] + q * arr[i] + suffixSum[i]) ;
        }
        System.out.println(result);
    }
}
