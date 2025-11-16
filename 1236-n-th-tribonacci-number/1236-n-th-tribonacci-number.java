class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2) {
            return 1;
        }
        else{
              int fiT=0;
              int sT=1;
              int tT=1;
                
            for(int i=1;i<=n;i++){
                int foT=fiT+sT+tT;
                fiT=sT;
                sT=tT;
                tT=foT;
              
            }
            return fiT;
        }
        
    }
}