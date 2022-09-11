class Solution {
    public int jump(int[] nums) {
      int[] dp=new int[nums.length];
        dp[nums.length-1]=0;
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=nums.length-1){
            dp[i]=1;
        }else{
                int min= dp[i+1];
               //finding min in dp upto reach of current num
                for(int j=1;j<=nums[i];j++){
                    if(dp[j+i]<min){
                        min=dp[j+i];
                    }
                }
            dp[i]=1+min;
        }
        }
        return dp[0];
    }
}