package recursion;

public class Subsets {
    //find all the subsets in the given set of integers
    //I am using recursion to that

    //Check the recursion tree in the notes
    public static void main(String[] args) {
        int[] arr = {1,2,3} ;  //given set
        int n  = arr.length ;

        //initializing temp int with max i.e. 'n' size as temp int can not be greater than arr .
      printAllSubsets(arr,n ,new int[n],0,0);

    }

    static void printAllSubsets (int[] arr , int N , int[] temp , int size , int index){
        if (index == N){
            for (int i = 0 ; i < size ; i++){
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return ;
        }
        //include the element
        temp[size] = arr[index] ;
        printAllSubsets(arr, N, temp, size + 1, index + 1);
        //exclude the element
        printAllSubsets(arr, N, temp, size , index + 1);
    }

/*
Recursion Tree for printAllSubsets(arr, n, temp, size, index):

Start: arr = {1, 2, 3}
Call: printAllSubsets(arr, 3, temp, 0, 0)

Level 0: index = 0
 ├─ Include arr[0]=1
 │   ├─ Include arr[1]=2
 │   │   ├─ Include arr[2]=3 → [1,2,3]
 │   │   └─ Exclude arr[2]=3 → [1,2]
 │   └─ Exclude arr[1]=2
 │       ├─ Include arr[2]=3 → [1,3]
 │       └─ Exclude arr[2]=3 → [1]
 └─ Exclude arr[0]=1
     ├─ Include arr[1]=2
     │   ├─ Include arr[2]=3 → [2,3]
     │   └─ Exclude arr[2]=3 → [2]
     └─ Exclude arr[1]=2
         ├─ Include arr[2]=3 → [3]
         └─ Exclude arr[2]=3 → []

Each path from root to leaf represents a subset.
*/


}
