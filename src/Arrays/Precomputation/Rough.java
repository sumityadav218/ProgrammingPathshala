package Arrays.Precomputation;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {

        //sliding windows
        int[] arr = {1,2,5,0,-2,3,4,1,-5,-12,-1,7} ;
        int k = 3 ;
        int window = 0;
        for (int i = 0 ; i<k ;i++){
            window += arr[i] ;
        }

        for(int i =k ; i<arr.length ;i++){
            window += arr[i] - arr[i-k] ;
            System.out.println(window);
        }

    }
}
