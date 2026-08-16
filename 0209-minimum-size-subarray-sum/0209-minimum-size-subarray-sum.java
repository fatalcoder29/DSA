class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low =0;
        int high=0;
        int sum=0;
        int min_sum=Integer.MAX_VALUE;
        while(high<n){
            sum=sum+nums[high]; //hired
            while(sum>=target){
                int len = high-low+1;
                min_sum=Math.min(min_sum,len);
                sum= sum-nums[low];  //fired
                low++;
            }
            high++;
        }
          if (min_sum == Integer.MAX_VALUE) {
            return 0;
        }
        return min_sum;
    }
}