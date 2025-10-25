package searching.BinarySearch;

import static searching.BinarySearch.FirstOccurrence.firstOcuurenceUsingBS;
import static searching.BinarySearch.LastOccurrence.lastOcuurenceUsingBS;

public class Frequency {

    public static void main(String[] args) {
        int arr [] = {1,1,1,1,2,2,2,2,3,4,4,5,5,5,5,6,6,6,6,8,8,8,8,8} ;
        System.out.println(lastOcuurenceUsingBS(arr,6) -firstOcuurenceUsingBS(arr,6)+1);
    }
}
