class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        /*for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==target){
                    return true;
                }
                
            }
        }
        return false;*/
        int i=0;
        int j=m[0].length-1;
        while(i<m.length&&j>=0){
            if(m[i][j]==target){
                return true;
            }
            else if(m[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}