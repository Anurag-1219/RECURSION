class Solution {
     public void reverseStringHelp(char[] s ,int st,int end){
    if(st>=end){
        return;
    }
char temp = s[st];
s[st]=s[end];
s[end]=temp;




reverseStringHelp(s, st+1,end-1);



     }


    public void reverseString(char[] s) {
        reverseStringHelp(s,0,s.length-1);
        
    }
}










