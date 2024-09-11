class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                ++j;
            }else{
                neg[k]=nums[i];
                ++k;
            }
        }
        int count=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[i/2];
            }else{
                nums[i]=neg[i-count];
                ++count;
            }
        }

        return nums;
        
    }
}
