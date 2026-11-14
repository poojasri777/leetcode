class Solution {
    static int c;
    static void find(int nums[],int idx,int sum,int tar){
        if(idx>=nums.length){
            if(sum==tar){
                c++;
            }
            return;
        }
        find(nums,idx+1,sum+nums[idx],tar);
        find(nums,idx+1,sum-nums[idx],tar);
    }
    public int findTargetSumWays(int[] nums, int tar) {
        
        c=0;
        find(nums,0,0,tar);
        return c;
    }
}