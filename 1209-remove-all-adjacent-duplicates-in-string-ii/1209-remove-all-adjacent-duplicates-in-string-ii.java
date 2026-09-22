class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chars = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!chars.isEmpty()&& chars.peek()==ch){
                int count = counts.pop();
                count++;
                if(count==k){
                    chars.pop();
                }
                else{
                    counts.push(count);
                }
            }
            else{
                chars.push(ch);
                counts.push(1);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<chars.size();i++){
            for(int j=0;j<counts.get(i);j++){
                res.append(chars.get(i));
            }
        }
        return res.toString();
    }
}