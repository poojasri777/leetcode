class Solution {
    public int[] dailyTemperatures(int[] t) {
     
     Stack<Integer>st=new Stack<>();
     int []a=new int[t.length];
     for(int i=0;i<t.length;i++){
      
        while(!st.isEmpty()&& t[i]>t[st.peek()]){
         int ind=st.pop();
        a[ind]=i-ind;
     } 
     st.push(i);
     }
     return a;  
    }
}