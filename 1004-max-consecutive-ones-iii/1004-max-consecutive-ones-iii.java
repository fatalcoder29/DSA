class Solution {
    public int longestOnes(int[] nums, int k) {
        int ei=0;
        int si=0;
        int count0=0;
        int ans=0;
        while(ei<nums.length){
            //grow
            if(nums[ei]==0){
                count0++;
            }
            while(count0>k){
                if(nums[si]==0){
                count0--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
        
    }
}