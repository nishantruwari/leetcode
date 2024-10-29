class Solution {
    public int searchInsert(int[] nums, int target) {

        int lb=0;
        int ub=nums.length-1;

        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]<target){
                lb=mid+1;
            }else{
                ub=mid-1;
            }
        }

        return lb;
        
    }
}
