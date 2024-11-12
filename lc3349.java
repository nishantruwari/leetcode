class Solution {
    public boolean check(List<Integer> nums, int start, int end){


        for(int i=start+1;i<end;i++){
            if(nums.get(i)<=nums.get(i-1)){
                return false;

            }
        }

        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        if(k==1){
            return true;
        }

        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            if(check(nums,i,i+k)&& check(nums,i+k,i+2*k)){
                return true;
            }
        }

        return false;
        
    }
}
