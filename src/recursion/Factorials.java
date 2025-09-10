package recursion;

public class Factorials {

    public static long factorial (int n ){
        if(n==0){
            return 1 ;  //terminal condition
        }
        return factorial(n-1)* n ;  //recursive condition
    }

    public static void main(String[] args) {
        System.out.println(factorial(1234)) ;
    }
}
