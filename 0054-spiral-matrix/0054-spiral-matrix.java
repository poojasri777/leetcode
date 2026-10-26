class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> al=new ArrayList<>();

        int left=0;
        int right=m[0].length-1;
        int t=0;
        int b=m.length-1;
        while(t<=b&&left<=right){
        for(int i=left;i<=right;i++){
          al.add(m[t][i]);
        }
        t++;
        for(int i=t;i<=b;i++){
            al.add(m[i][right]);
        }
        right--;
        if(t<=b){
        for(int i=right;i>=left;i--){
            al.add(m[b][i]);
        }
        b--;
        }
        
        if(left<=right){
        for(int i=b;i>=t;i--){
            al.add(m[i][left]);
        }
        left++;
        }
        }
        return al;
    }
}