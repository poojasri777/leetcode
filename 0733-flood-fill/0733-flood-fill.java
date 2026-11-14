class Solution {
    
    void find(int image[][],int i,int j,int color,int src_color){
        if(i<0||j<0||i>=image.length||j>=image[0].length)return;
        if(image[i][j]!=src_color||image[i][j]==color )return;
        image[i][j] = color;
        find(image,i+1,j,color,src_color);
        find(image,i-1,j,color,src_color);
        find(image,i,j+1,color,src_color);
        find(image,i,j-1,color,src_color);
    }
    public int[][] floodFill(int[][] image, int i, int j, int color) {
        int src_color=image[i][j];
         find(image,i,j,color,src_color);
         return image;
    }
}