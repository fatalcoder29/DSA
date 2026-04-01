class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low =1;
        long high=(long)Arrays.stream(time).min().getAsInt()*totalTrips;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(isPossible(time,totalTrips,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public boolean isPossible(int [] time,long totalTrips,long mid){
        long trips=0;
        for(long t : time){
            trips+=mid/t;
            if(trips>=totalTrips){
                return true;
            }
        }
        return false;
    }
}