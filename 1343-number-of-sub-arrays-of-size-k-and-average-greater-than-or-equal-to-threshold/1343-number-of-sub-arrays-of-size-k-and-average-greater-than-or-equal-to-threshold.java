class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if (sum/k>=threshold) {
        c++;
        }
       for(int j=k;j<arr.length;j++){
         sum=sum-arr[j-k]+arr[j];
        int avg=sum/k; 
            if(avg>=threshold){
                c++;
            }
         }
        return c;
    }
}