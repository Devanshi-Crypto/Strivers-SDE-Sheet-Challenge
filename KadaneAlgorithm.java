public class kadaneAlgorithm{
    //aka Maximum sum Sub Array
    public static int maxSumSubArr(int[] nums){
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        if (maxSoFar < 0) {
            return 0; // Return 0 if all elements are negative
        }
        return maxSoFar;
    }
    // public static void main(String[] args) {
    //     int[] nums = { 2,3,-1,3,5,6,0,1};
    //     int maxSum = maxSumSubArr(nums);
    //     System.out.println("Maximum Sum Subarray: " + maxSum);
    // }
}