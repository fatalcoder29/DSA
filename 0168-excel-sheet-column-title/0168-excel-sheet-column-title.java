class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();
        while(col>0){
            col--;
            int r=col%26;
            char ch=(char)('A'+r);
            sb.append(ch);
            col/=26;
        }
        return sb.reverse().toString();
        
    }
}