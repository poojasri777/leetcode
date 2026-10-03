class Solution {
    public int minAddToMakeValid(String s) {
    int o=0;
    int c=0; 
    
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            o++;
        }
        if(s.charAt(i)==')'){
            if(o>0){
                o--;
            }
            else{
            c++;
            }
        }
     }   
     return o+c;
    }
}