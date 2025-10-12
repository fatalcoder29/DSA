class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxSum=nums[0], curMax=nums[0];
        int minSum=nums[0], curMin=nums[0];
        for(int i=1; i<nums.length; i++){
            curMax= Math.max(nums[i],curMax + nums[i]);
            maxSum = Math.max(curMax,maxSum);
            curMin= Math.min(nums[i] , curMin + nums[i]);
            minSum=Math.min(curMin,minSum);
            total +=nums[i];
        }
        total +=nums[0];
        if(maxSum<0) return maxSum;
        return Math.max(maxSum,total-minSum);
    }
}