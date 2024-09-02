class Solution {
    public int removeDuplicates(int[] nums) {
        int a=-111;
        int count=0;
        int in=-1;;
        for(int i=0;i<nums.length;i++){
            if(a==nums[i]){
                continue;
            }
           a=nums[i];
            in++;
            if(in!=i){
                nums[in]=nums[i];
            }
            

            ++count;

        }
        return count;
        
    }
}
