class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int resSum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right= n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    return target;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                
                int diffTarget = Math.abs(sum-target);
                if(diffTarget < minDiff){
                    resSum = sum;
                    minDiff=diffTarget;
                }
            }
        }
        return resSum;
    }
}