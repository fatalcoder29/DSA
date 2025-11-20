class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        int [] res= new int[26];
        for(int i=0;i<n;i++){
           int  ind = sentence.charAt(i)-'a';
            res[ind]=1;
        }
        for(int i=0;i<26;i++){
            if(res[i]<1){
                return false;
            }
        }
        return true;
        
    }
}