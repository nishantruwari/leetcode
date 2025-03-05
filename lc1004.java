class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int max=0;
        int count=0;
        int n=nums.length;
        while(right<n){
            if(nums[right]==0){
                if(count==k){
                    max=Math.max(right-left,max);
                    while(nums[left]!=0){
                        ++left;
                    }
                    ++left;

                }else{
                    count++;
                }
            }
            ++right;
        }
        max=Math.max(right-left,max);
        return max;
        
    }
}
