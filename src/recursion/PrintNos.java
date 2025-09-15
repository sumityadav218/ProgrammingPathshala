package recursion;

public class PrintNos {

    // Recursive function to print numbers from 1 to N in ascending order
    static void printNos (int N){
        // Base case: when N reaches 0, stop recursion
        if(N==0){
            return  ;
        }
        // First, recursively print all numbers up to N-1
        printNos(N-1);
        // Then print N (this ensures ascending order)
        System.out.println(N);
    }

    public static void main(String[] args) {
        // Start printing from 1 to 100
        printNos(100);
    }

}
