class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isItPossible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isItPossible(int arr[],int mid,int totalhour){
        int h=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                h++;
            }
            else if(arr[i]% mid==0){
                h=h+arr[i]/mid;
            }
            else{
                h=h+arr[i]/mid+1;
            }
            if(h>totalhour){
                return false;
            }
        }
        return true;
    }
}