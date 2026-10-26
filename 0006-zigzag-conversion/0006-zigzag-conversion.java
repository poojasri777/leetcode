class Solution {
    public String convert(String s, int numrows) {
        if(numrows==1||numrows>=s.length())
        return s;
        int i=0;
        int j=0;
        int k=0;
        char a[][]=new char[numrows][s.length()];
        while(k<s.length()){
            if(i<numrows){
              a[i][j]=s.charAt(k);
              k++;
              i++;
            }
            if(i==numrows){
            i-=2;
            j++;
            while(i>0&&k<s.length()){
            a[i][j]=s.charAt(k);
            k++;
            i--;
            j++;
           }
        }
        }
    String m="";
    for( i=0;i<a.length;i++){
        for( j=0;j<a[i].length;j++){
            if(a[i][j]!='\0'){
                m+=a[i][j];
            }      
                }
            }
        
        return m;
    }
}