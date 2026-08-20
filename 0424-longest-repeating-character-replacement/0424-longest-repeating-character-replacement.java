class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int maxF=0;
        int res=0;
        int [] f = new int [26];
        for(int high=0;high<s.length();high++){
            int idx= s.charAt(high)-'A';
            f[idx]++;

            maxF=Math.max(maxF,f[idx]);
            int windowLength=high-low+1;
            int replacement = windowLength-maxF;

            while(replacement>k){
                int leftidx=s.charAt(low)-'A';
                f[leftidx]--;
                low++;

                windowLength=high-low+1;
                replacement=windowLength-maxF;

                
            }
            res=Math.max(res,high-low+1);
        }
        return res;
        
    }
}