class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int low=0;
        int high=k-1;
        double sum =0;
        for(int i=low;i<=high;i++){
            sum=sum+nums[i];
        }
        double max_avg=(double) sum/k;
        while(high<n-1){
            low++;
            high++;
            sum=sum-nums[low-1]+nums[high];
            double avg = (double) sum/k;
            max_avg=Math.max(max_avg,avg);
        }
        return (double) max_avg;
        
    }
}