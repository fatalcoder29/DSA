class Solution {
    public boolean checkRecord(String s) {
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='A') count++;
        }
        if(count>1 || s.contains("LLL")){
            return false;
        }
        return true;
        
    }
    
}