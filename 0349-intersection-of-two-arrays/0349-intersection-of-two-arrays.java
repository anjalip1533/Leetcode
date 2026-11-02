class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1=new HashSet<>();
        for(int num:nums1){
        set1.add(num);
         }

         HashSet<Integer> intersection1=new HashSet<>();

         for(int num:nums2){
            if(set1.contains(num)){
                intersection1.add(num);
            }
         }

         int[] result=new int[intersection1.size()];

         int index=0;
         for(int num:intersection1){
            result[index++]=num;
         }
        return result;
    }
}