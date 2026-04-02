class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        int old_color=image[sr][sc];
        helper(image,sr,sc,color,old_color);
        return image;
        
    }
    public void helper(int image[][] ,int sr,int sc,int color,int old_color){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=old_color){
            return;
        }
        image[sr][sc]=color;
        //up
        helper(image,sr-1,sc,color,old_color);
        //down
        helper(image,sr+1,sc,color,old_color);
        //right
        helper(image,sr,sc+1,color,old_color);
        //left
        helper(image,sr,sc-1,color,old_color);
    }
}