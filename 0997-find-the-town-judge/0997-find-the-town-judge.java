class Solution {
    public int findJudge(int n, int[][] trust) {
        int ind[]=new int[n+1];
        int out[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
            ind[trust[i][0]]++;
            out[trust[i][1]]++;
        }
        for(int i=1;i<out.length;i++){
            if(ind[i]==0 &&out[i]==n-1)return i;

        }
        return -1;
    }
}