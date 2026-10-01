class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used =new boolean[nums.length];
       backtrack(nums, new ArrayList<>(), used, result);
       return result;

    }
    private void backtrack(int[] nums, List<Integer>currentlist, boolean[] used, List<List<Integer>> result){
        if(nums.length==currentlist.size()){
            result.add(new ArrayList<>(currentlist));
            return;
        }
        for(int i=0; i<nums.length;i++){
           if(used[i]){
            continue;
           }
        
        if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
            continue;
        }
        
        used[i]=true;
        currentlist.add(nums[i]);

        backtrack(nums, currentlist, used, result);
      
         used[i]=false;
      currentlist.remove(currentlist.size()-1);
        }
    }
}