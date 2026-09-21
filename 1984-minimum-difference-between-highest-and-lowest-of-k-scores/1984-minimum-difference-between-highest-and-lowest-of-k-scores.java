class Solution {
    public int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    if(k==1){
        return 0;
    }
    int min=nums[k-1]-nums[0];
    int i=1;
    for(int j=k;j<nums.length;j++){
        min=Math.min(min,nums[j]-nums[i]);
        i++;
    }
    return min;
}
}