class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int candy: candies){
            if(candy>max){
                 max=candy;

            }
        }
        for(int candy:candies){
            if(candy+extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;

        
    }
}