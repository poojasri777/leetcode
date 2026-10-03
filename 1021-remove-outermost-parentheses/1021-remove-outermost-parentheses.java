class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int oc=0;
        int cc=0;
        int st=0;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                oc++;
            }
            if(s.charAt(i)==')'){
                cc++;
            }
            if(oc==cc){
                str+=s.substring(st+1,i);
                st=i+1;
                oc=0;
                cc=0;
            }
        }
            return str;
    }
}