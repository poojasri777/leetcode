class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m[][]=new int[image.length][image[0].length];
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
               m[i][j]=image[i][image[i].length-1-j];
            
            
        
        if(m[i][j]==0){
            m[i][j]=1;
        }
        else{
            m[i][j]=0;
        }
        }
    }
        return m;

    }
}