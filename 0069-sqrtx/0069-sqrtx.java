class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
         long start=1;
         long end=x/2;
         long ans=0;
         while(start<=end)
        {
            long mid=start+(end-start)/2;
            long square=mid*mid;
            if(square==x){
                return (int)mid;
            }else if(square<x){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
                
            }

        }
        return (int) ans;
        
    }
}