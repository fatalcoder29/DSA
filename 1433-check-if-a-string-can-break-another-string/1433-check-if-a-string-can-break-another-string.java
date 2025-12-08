class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean aBreakB=true;
        boolean bBreakA=true;
        for(int i=0 ; i<a.length;i++){
            if(a[i]<b[i]) aBreakB=false;
            if(b[i]<a[i]) bBreakA=false;
        }
        return aBreakB || bBreakA;
        
    }
}