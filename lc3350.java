class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {

        int n=nums.size();
        int premax=0;
        int res=0;
        int up=1;
        
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                ++up;
            }else{
                premax=up;
                up=1;
            }
            res=Math.max(res,Math.max(up/2,Math.min(premax,up)));
        }

        return res;
        
    }
}
