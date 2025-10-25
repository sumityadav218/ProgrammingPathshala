package searching.BinarySearch;

public class LastOccurrence {

    public static void main(String[] args) {
        //input
        int key = 5 ;
        int arr[] = {1,2,2,4,4,4,5,5,5,6,7,7} ;
        //output
        //8
        System.out.println( lastOcuurenceUsingBS(arr, key));

    }
    public static int lastOcuurenceUsingBS(int[] arr, int key) {
        int left = 0 ;
        int right = arr.length-1 ;

        while (left<=right){
            int mid = left + (right-left)/2 ;
            if (key > arr[mid]){
                left = mid +1 ;
            }
            else if (key < arr[mid]){
                right = mid-1 ;
            }
            //arr[mid]==key //
            //now we have to check whether the index is last occurence or what
            else {
                //edge case
                if(mid==arr.length-1){
                    return mid;

                    //very important condition last 2 blocks to check the last occurence
                }else if (arr[mid]==key && arr[mid+1]!=key){
                    return mid ;
                }
                else {
                    left = mid + 1 ;
                }
            }
        }
        return -1 ;
    }
}
