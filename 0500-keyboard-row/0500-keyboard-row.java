class Solution {
    public boolean pos(String s, String f1){
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(f1.indexOf(c)==-1) return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> list= new ArrayList<>();
        String r1="qwertyuiop";
       String r2="asdfghjkl";
       String r3="zxcvbnm";
       for(String i:words){
        if(pos(i,r1)|| pos(i,r2) || pos(i,r3)){
            list.add(i);

        }
       }
       for(String i:list) System.out.println(i);
       String [] a = new String[list.size()];
       int idx=0;
       for(String i:list){
        a[idx++]=i;
       }
       return a;


       }
    }
