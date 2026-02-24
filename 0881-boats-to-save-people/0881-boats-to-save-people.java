class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p=0;
        int q=people.length-1;
        int boat=0;
        while(p<=q){
            if(people[p]+people[q]<=limit){
                p++;
                q--;
                boat++;
            }
            else{
                q--;
                boat++;
            }
            
        }
        return boat;
        
    }
}