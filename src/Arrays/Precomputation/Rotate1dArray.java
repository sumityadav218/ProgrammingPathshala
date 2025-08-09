package Arrays.Precomputation;

public class Rotate1dArray  {


    //BRUTE FORCE FAILS FOR ONE TEST CASE CHECK LEETCODE FOR SOLUTIONS Q.189
    public void rotate(int[] nums, int k) {
        int size = nums.length ;
        //brute force solution

        //rotating till only modulus of k after that rotations repeats
        //also traversing it from right side so that value dont gets overriden
        for (int i = 0 ; i < k%size ; i++){
            int temp = nums[size-1] ;
            for (int j = size-1 ; j > 0 ; j--){
                nums[j]=nums[j-1] ;
            }
            nums[0]=temp ;
        }


        //COMING TO OPTIMAL SOLUTION WHICH I THINK IS TO REVERSE THE ARRAY
        //REVERSE WHOLE ARRAY--> Very important
        //REVERSE FIRST PART--> below 2 steps need not be in order
        //REVERSE SECOUND PART

        /*public void rotate(int[] nums, int k) {
            //optimal soltuion using reversal of array
            k %= nums.length ;
            reversal(nums,0,nums.length-1) ;
            reversal(nums,0,k-1) ;
            reversal(nums,k,nums.length-1);

        }

        public void reversal (int[] nums ,int start , int end) {
            //using 2 pointers algo to reverse the array
            while(start < end){
                nums[start]=nums[start]+nums[end] ;
                nums[end]=nums[start]-nums[end] ;
                nums[start]=nums[start]-nums[end] ;
                start++ ;
                end-- ;
            }
        }*/

    }
}
