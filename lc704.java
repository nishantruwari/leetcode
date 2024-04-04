class Solution {
    public int search(int[] nums, int target) {
       int u=nums.length-1;
       int l=0,ding; 
        while(u>=l){
            ding=(u+l)/2;
            if(target==nums[ding]){
                return ding;
            }
            if(nums[ding]<target){
                l=ding+1;
            }
            else{
                u=ding-1;
            }
        }
        return -1;
    }
}