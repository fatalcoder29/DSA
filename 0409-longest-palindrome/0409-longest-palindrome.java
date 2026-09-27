class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean hasOdd=false;
        for(int count : map.values()){
            if(count%2==0){
                length=length+count;
            }
            else{
                length=length+count-1;
                hasOdd=true;
            }
        }
        if(hasOdd){
            length++;
        }
        return length;
    }
}