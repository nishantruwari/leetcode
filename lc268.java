class Solution {
    public int missingNumber(int[] nums) {
        int currsum=0;
        int n=0;
        for(int i: nums){
            currsum+=i;
            ++n;
        }

        int sum=(n*n+n)/2;
        return sum-currsum;
        
    }
}
