class Solution {
    public int findMin(int[] nums) {
        
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int lb=0;
        int ub=len-1,mid=-1;
        while(lb<=ub){
            mid=lb+(ub-lb)/2;
            if(nums[lb]<=nums[mid]){
                min=Math.min(min,nums[lb]);// we got smallest element here
                // now we need to search for the other side too
                lb=mid+1;


            }else{
                min=Math.min(min,nums[mid]);
                ub=mid-1;
            }


        }
        return min;
    }
}