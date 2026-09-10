class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;
        int prelength=0;
        int currlength=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
             currlength++;
            }else{
              count+=Math.min(prelength,currlength);
              prelength=currlength;
              currlength=1;
            }
        }
          count+=Math.min(prelength,currlength);
             return count;
    }
}