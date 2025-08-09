package GCD;

public class GCDBruteForce {

    public static void main(String[] args) {
        //find GCD of 12,18 ==6
        int a = 12 ;
        int b = 18 ;
        int GCD = 0 ;
        for (int i = 1 ; i < Math.min(a,b); i++){
            if (a%i==0 && b%i==0){
                GCD =  i  ;
            }
        }

        System.out.println(GCD);
    }
}
