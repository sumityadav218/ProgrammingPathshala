package Arrays.Precomputation;

public class SlidingWindow2 {

    //you have given arr [N] , int k , int x ,
    //print frequency of x in every window of size k .
    public static void main(String[] args) {
        int [] arr = {2,2,1,3,1,2,1,1,2,2,3,3} ;
        int k = 4 ;
        int x = 2 ;
        int freq = 0 ;
        for (int i = 0 ; i < k ; i++){
            if (arr[i]==x){
                freq++ ;
            }
        }
        System.out.println("frequency of x in first window = " + freq);

        for (int i = k ; i < arr.length ; i++ ){
            if (arr[i] == x ){
                freq++ ;
            }
            if (arr[i-k] == x){
                freq-- ;
            }
            System.out.println("Window [" + (i - k + 1) + " to " + i + "]: freq = " + freq);
        }

       // System.out.println("frequency of x in every window = " + freq);
    }

}
