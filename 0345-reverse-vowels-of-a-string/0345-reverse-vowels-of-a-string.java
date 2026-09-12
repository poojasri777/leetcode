class Solution {
    public String reverseVowels(String s) {
     String s1= "aeiouAEIOU";
     char arr[]=s.toCharArray();
     int i=0;
     int j=arr.length-1;
     while(i<=j){
        if(s1.indexOf(arr[i])==-1){
            i++; continue;
        }
        else if(s1.indexOf(arr[j])==-1){
            j--; continue;
        }
        else {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
     }
     return new String(arr );
    }
}