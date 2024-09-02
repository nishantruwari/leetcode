class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length-1;j++){
                int m=nums[(i+j)%nums.length];
                int n=nums[(i+1+j)%nums.length];
                if(m>n){
                    flag=1;
                }
            }
            if(flag==0){
                return true;
            }
           

        }
        return false;
        
    }
}
