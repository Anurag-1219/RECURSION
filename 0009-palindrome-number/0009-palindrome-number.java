class Solution {
    public boolean isPalindrome(int x) {
          String s = String.valueOf(x); 
        int forward = 0;
        int backward= 0 ;
        for(int i = 0 ; i<s.length();i++){
         forward = forward * 10 + (s.charAt(i) - '0');

        }
            for(int j =s.length()-1; j>=0;j--){
                backward = backward * 10 + (s.charAt(j) - '0');
            }
        

        if(forward == backward){
            return true;
        }
        else {
            return false;
        }
    }
}