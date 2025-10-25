package searching.BinarySearch;

public class BinarySearch {
    //use binary search to find the index of a target no from array
    //binary search can be only applicable on an ordered array
    //input
    //this is a simple case for binary search now there are couple of problems on binary search
    //i.e first occurrence , last occurrence , count the frequency of the key .
    public static void main(String[] args) {
        int target = 334 ;
        int arr[] = { 1,3,4,6,89,334} ;

        System.out.println(binarySearch(arr, target));


    }

    private static int binarySearch(int[] arr, int target) {
        //binary search
        int low = 0 ;
        int high = arr.length -1 ;

        while (low<=high){
            int mid = low + (high-low)/2 ;  //prevents overflow
            if(arr[mid]== target){
                return mid;
            }else if (arr[mid]>target){
                high = mid-1 ;
            }
            else {
                low =mid+1 ;
            }
        }
        return -1 ;
    }
}
