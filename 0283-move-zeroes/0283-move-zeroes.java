class Solution {
    public void moveZeroes(int[] nums) {
        int insertValue=0;
     
     for(int num :nums){
        if(num!=0){
        nums[insertValue]=num;
        insertValue++;
        }
     }

       while (insertValue<nums.length){
        nums[insertValue]=0;
        insertValue++;
       }

    
    }
}