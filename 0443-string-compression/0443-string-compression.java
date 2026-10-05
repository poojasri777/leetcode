class Solution {
    public int compress(char[] chars) {
    int i=0;
    int j=0;
    int c=0;
    String s="";
    while(j<chars.length){
        if(chars[i]==chars[j]){
            c++;
            j++;
        }
        else{
            if(c>1){
            s+=""+chars[i]+c;
            }
            else s+=chars[i];
            i=j;
            c=0;
            }
        }
     
    if(c>1){
        s+=""+chars[i]+c;
    }
    else s+=chars[i];
    for(int k=0;k<s.length();k++){
          chars[k]=s.charAt(k);
    }
    return s.length();
    }
}