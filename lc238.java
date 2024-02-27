class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int prod=1,flag=0,flag2=0;
        for(int n: nums){
            if(n!=0){
                prod*=n;
                flag2=1;
            }else {
                if(flag==1){
                    prod=0;
                }
                flag=1;
            }
            
        }
        if(flag2==0){
            prod=0;
        }
        for(int i=0;i<nums.length;i++){
            if(flag!=1){
                ans[i]=prod/nums[i];
            }else{
                if(nums[i]!=0){
                    ans[i]=0;
                }else{
                    ans[i]=prod;
                }
            }
            
        }
        return ans;
        
    }
}