class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])&& map.get(target-nums[i])!=i){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
        }

        return res;
        
    }
}
