class Solution {
    public int[] diStringMatch(String s) {
    int st=0;
    int j=s.length();
    int k=0;
    int a[]=new int[s.length()+1];
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='I'){
            a[k]=st;
            st++;
            k++;
        }
        else {
             a[k]=j;
            j--;
            k++;
        }
    }
    a[k]=st;
    return a;    
    }
}