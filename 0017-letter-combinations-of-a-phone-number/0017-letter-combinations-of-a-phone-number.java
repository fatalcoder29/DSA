class Solution {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        combination(digits,"",list);
        return list;
    }
    public void combination(String s,String ans ,List<String> list){
        if(s.length()==0){
            list.add(ans);
            return;
        }
        char ch = s.charAt(0); //'2'
        int nums = ch-'0'; //convert into integer
        String press= map[nums];//abc;
        for(int i=0;i<press.length();i++){
            combination(s.substring(1),ans+press.charAt(i),list);
        }
    }
}