class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(int a[],int idx){
        if(idx>=a.length){
            ArrayList<Integer>al=new ArrayList<>();
            for(int i:a){
                al.add(i);
        }ans.add(al);
        return;
    }
        for(int i=idx;i<a.length;i++){
            swap(i,idx,a);
            fun(a,idx+1);
            swap(i,idx,a);
            }
    }
    void swap(int i,int j,int a[]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        fun(nums,0);
        return ans;
    }
}