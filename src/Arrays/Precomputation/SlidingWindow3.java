package Arrays.Precomputation;

public class SlidingWindow3 {

  /*  Question : given int arr of size n , int k , of X=?  Window size
    Find min no of swaps to bring all elements <=k together*/

    /*example Arr[] = { 2 ,1 ,5 ,6 ,3}
    * k=3
    * when we swap 5 and 3 , 2 1 3 come together with value less or equal than k
    * only one swap is needed
    * o/p=1 */

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,8,7,4} ;
        int k = 5 ;

        //first step is to calculate the missing X , which is window size
        //and that window size is count of elements <= K also known as legalElements .

        int legalElements = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i]<=k){
                legalElements++ ;
            }
        }

        //secound step is just to calculate the max window size of those legal elements
        //and subtract it from legal elements that would give you min no of swaps
        //similar to calculating the freq of elements question 2 of sliding windows
        int maxLegalElements = 0 ;
        for (int i = 0 ; i < legalElements ; i++ ){
            if (arr[i]<=k){
                maxLegalElements++ ;
        }}


        int count =0;
        for (int i = legalElements ; i < arr.length ; i++){
            if (arr[i]<=k){
              count++;
            }
            if(arr[i-legalElements]<=k){
               count-- ;
            }

          maxLegalElements = Math.max(count ,maxLegalElements ) ;
        }
        System.out.println(legalElements-maxLegalElements);

    }

}
