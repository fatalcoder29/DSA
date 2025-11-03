class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int [] customers:accounts){
            int sum=0;
            for(int money:customers){
                sum+=money;
            }
            maxWealth=Math.max(maxWealth,sum);
        }
        return maxWealth;
        
    }
}