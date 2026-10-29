class Solution {
    public boolean canWinNim(int n) {
        
        if(n==1){
            return true;
        }else if(n==2)
        {
            return true;
        }
    return n %4!=0;
    }
}