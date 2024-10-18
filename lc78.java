class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public void solve(int i, int[] nums,List<Integer> temp ){

        if(i>=nums.length){
            result.add(new ArrayList(temp));
            return;
        }
        
         temp.add(nums[i]);
        solve(i+1,nums,temp);
       
        temp.remove(temp.size()-1);
         
       
        solve(i+1,nums,temp);
        

        
    }
    public List<List<Integer>> subsets(int[] nums) {
        

        List<Integer> temp=new ArrayList<>();

        solve(0,nums,temp);

        return result;


        
    }
}
