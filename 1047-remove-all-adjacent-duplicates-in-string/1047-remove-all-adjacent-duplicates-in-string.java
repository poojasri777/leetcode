class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> st=new Stack<>();
     int c=0;
     for(int i=0;i<s.length();i++){
        if(st.isEmpty()){
            st.push(s.charAt(i));
        }
        else if(s.charAt(i)==st.peek()){
            
                st.pop();
        }
        else{
            st.push(s.charAt(i));
             
        }
     }
     
     String  r="";
    for(char ch:st){
        r+=ch;
    }
    return r;
    }
}