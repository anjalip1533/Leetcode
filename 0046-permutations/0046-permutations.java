class Solution {
    public List<List<Integer>> permute(int[] nums) {

       List<List<Integer>>result=new ArrayList<>();
       boolean[] used=new boolean[nums.length];
       backtrack(nums, new ArrayList<>(),used,result); 
       return result;
    }

    private void backtrack(int[] nums, List<Integer>currentList, boolean[] used, List<List<Integer>>result){
      if(nums.length==currentList.size()){
        result.add(new ArrayList<>(currentList));
         return;
      }
      for(int i=0;i<nums.length;i++){
        if(used[i]){
            continue;
        }
        used[i]=true;
        currentList.add(nums[i]);
      
       backtrack(nums, currentList,used,result); 
       used[i]=false;
       currentList.remove(currentList.size()-1);
      }
    }
}