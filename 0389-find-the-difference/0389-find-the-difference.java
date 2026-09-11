class Solution {
    public char findTheDifference(String s, String t) {
        
      int sum_t=0;
      int sum_s=0;

      for(int i=0;i<s.length();i++){
        sum_s+=s.charAt(i);
      }
       for(int i=0;i<t.length();i++){
        sum_t+=t.charAt(i);
      }
      return (char)(sum_t-sum_s);

    }
}