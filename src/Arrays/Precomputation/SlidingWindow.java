package Arrays.Precomputation;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,0,4} ;
        int k = 3 ;
        //print sum of all its subarray of size k


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

        //sliding window technique  --check if it correct ?

        int sum  = 0 ;
        for (int i = 0 ; i < k ; i++){
            sum +=arr[i]  ;
        }

        for (int i = k ; i < arr.length-1 ; i++){
            sum = sum-arr[i-k]+arr[k] ;
        }

        System.out.println(sum);
    }
}
