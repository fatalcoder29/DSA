class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
       
        int low=0;
        int high=1;
        int count=0;
        int sum = Integer.MIN_VALUE;
        while(low<nums.length-1 && high < nums.length){
            int diff = nums[high]-nums[low];
            if(diff==k && nums[high]+nums[low]!=sum){
                sum = nums[high]+nums[low];
                count++;
                low++;
                high++;

            }
            else if(diff<k){
                high++;
            }
            else{
                low++;
            }
            if(low==high){
                high++;
            }
        }
        return count;
        
    }
}