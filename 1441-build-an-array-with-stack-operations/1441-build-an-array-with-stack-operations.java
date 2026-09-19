class Solution {
    public List<String> buildArray(int[] arr, int n) {
        Stack<String> st = new Stack<>();
        int i = 1;
        int j = 0;
        while(j<arr.length){
            if(i==arr[j])
            {st.push("Push");
            i++;j++;}
            else{
                    st.push("Push");
                    st.push("Pop");i++;
            }
        }
        return st;
    }
}