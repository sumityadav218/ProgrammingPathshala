package recursion.DivideAndConquer;

public class FastExponentiation {
    //given N ,K find N^K WHERE K>=0
    public static void main(String[] args) {
        //brute force
        int common_val = 1 ;
        int n = 2 ;
        int k = 12 ;
        for (int i = 0  ; i < k ; i++ ){
            common_val = common_val * n ;
        }
        System.out.println(common_val);

        //calling fast exponentiation function
        System.out.println(power(k,n));
    }

    //time complexity is too much i.e O(K)
    //now implementing divide and conquer time complexity O(log2(k))

    static int power (int k , int n) {
        if (k==0){
            return 1 ;
        }
       int x =  power (k/2 , n) ;
        //even k
        if (k%2==0){
            return x*x ;
        }
        //odd values of k
        return x*x*n ;
    }

}
