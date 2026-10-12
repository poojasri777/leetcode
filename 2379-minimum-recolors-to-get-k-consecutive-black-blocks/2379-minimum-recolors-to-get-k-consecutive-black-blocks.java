class Solution {
    public int minimumRecolors(String b, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W'){
                c++;
            }
        }
        int min=c;
        for(int j=k;j<b.length();j++){
            if(b.charAt(j)=='W'){
                c++;
            }
            if(b.charAt(j-k)=='W'){
                c--;
            }
            min=Math.min(min,c);
        }
        return min;
    }
}