class Solution {
    List<List<Integer> > ans=new ArrayList<>();

    public void dfs(int i,int sum,List<Integer> currlist,int[] candidates){
        if(i==candidates.length && sum==0){
            ans.add(new ArrayList<>(currlist));
            
        }

        if(i>=candidates.length || sum<0){
            return;
        }

        currlist.add(candidates[i]);
        dfs(i,sum-candidates[i],currlist,candidates);

        currlist.remove(currlist.size()-1);

        dfs(i+1,sum,currlist,candidates);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> currlist=new ArrayList<>();
        dfs(0,target,currlist,candidates);
        return ans;
    }
}
