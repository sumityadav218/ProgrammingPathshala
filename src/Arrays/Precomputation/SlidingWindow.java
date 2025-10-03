package Arrays.Precomputation;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,0,4} ;
        int k = 3 ;
        //print max sum of all its subarray of size k


        //this is one of the way which i originally thought using precompute
        int [] pmax = new int[arr.length] ;
        pmax[0]=arr[0] ;
        for (int i = 1 ; i < arr.length ; i++){
            pmax[i] = pmax[i-1] + arr[i] ;
        }



        int temp = 0 ;
        for (int i = 0 ; i  < k ; i++){
            if (i==0){
                temp+= pmax[k-1] ;
            }
            else {
                temp += pmax[k-1+i]-pmax[i-1];
            }
        }

        System.out.println(temp);

      //sliding window technique
        int windowSum = 0 ;
        for (int i = 0 ; i < k ; i++){
            windowSum+= arr[i] ;
        }
        int maxSum = windowSum ;
        for (int i = k ; i < arr.length ; i++){
            windowSum += arr[i] - arr[i-k] ;
            maxSum = Math.max(maxSum,windowSum) ;
        }
        System.out.println(maxSum);


    }
}
