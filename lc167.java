class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        for(int i=0,j=numbers.length-1;i<j;){
            

            if(target==(numbers[i]+numbers[j])){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;

            }else{
                if(target<(numbers[i]+numbers[j])){
                    j=j-1;
                }else{
                    i=i+1;
                }
            }
        }
        return ans;
        
    }
}
