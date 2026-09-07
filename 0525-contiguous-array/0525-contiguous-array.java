class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int maxLen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=one-zero;
            if(map.containsKey(diff)){
                maxLen=Math.max(maxLen,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
        }
        return maxLen;
    }
}