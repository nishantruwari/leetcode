class Solution {
    public int search(int[] nums, int target) {
        int lb=0;
        int ub=nums.length-1,mid;
        int pos=-1;
        while(lb<=ub){
            mid=lb+(ub-lb)/2;
            if(target==nums[mid]){
                return mid;
            }
           
            if(nums[lb]<=nums[mid]){
                if(target>=nums[lb]&&target<=nums[mid]){
                    ub=mid;
                }else{
                    lb=mid+1;
                }
            }else{
                if(target>=nums[mid]&&target<=nums[ub]){
                    lb=mid;
                }else{
                    ub=mid-1;
                }
            }


        }
        return pos;
        
    }
}