class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<>();
        int n=temp.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
           while(!stack.isEmpty()&& temp[i]>=temp[stack.peek()]){
               stack.pop();
           }
           if(!stack.isEmpty()){
               ans[i]=stack.peek()-i;
               

           }
           stack.push(i);

           
        }
        return ans;
        
    }
}