class Solution {
    public int longestPalindrome(String s) {
        
        int[] freq =new int[128];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
          int length=0;
          boolean hashOdd =false;
        for(int count :freq){
            length+=(count/2)*2;
              
              if(count%2!=0){
                hashOdd=true;
              }
        }
        if(hashOdd){
            length+=1;
        }
        return length;
    }
}