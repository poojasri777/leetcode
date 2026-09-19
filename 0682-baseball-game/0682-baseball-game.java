class Solution {
    public int calPoints(String[] a) {
        Stack<Integer> st=new Stack<>();
        for(String s:a){
            if(s.equals("C")){
                    st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                int c=st.pop();
                int b=st.peek();
                st.push(c);
                st.push(c+b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum +=st.pop();
        }
        return sum;
    }
}