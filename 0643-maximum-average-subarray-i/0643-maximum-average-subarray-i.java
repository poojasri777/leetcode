class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int i=0;
        double max=(double)sum/k;
        for(int j=k;j<nums.length;j++){
            sum-=nums[i];
            sum+=nums[j];
            i++;
             
         max=Math.max(max,(double)sum/k);
        }
        return max;
    }
}