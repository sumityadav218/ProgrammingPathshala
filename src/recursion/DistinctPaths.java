package recursion;

public class DistinctPaths {

static int m=3 ;
    static int n=3 ;
    public static void main(String[] args) {
        System.out.println("total no of path is " + paths(0,0));
        //0,0 is the starting point
    }

    public static int paths (int i , int j ){
       if (i==m-1 || j==n-1){
           return 1 ; //whenever the position is on last row or last column
       }
      return  paths(i+1,j)+paths(i,j+1) ;
       //moving right + moving down
    }
}
