class Solution {
    public String largestNumber(int[] nums) {
        String []  arr= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(A,b)->(b+A).compareTo(A+b));
        if(arr[0].equals("0")) return new String("0");
        String res="";
        for(String i:arr) res= res+i;
        return res;
    }
}