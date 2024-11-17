class Solution {
    vector<vector<int>> ans;

public:

    void dfs(int i,int sum,vector<int>& candidates, vector<int>& currlist){
        if(i==candidates.size() && sum==0){
            ans.push_back(currlist);
        }

        if(sum<0 || i>=candidates.size()){
            return;
        }

        currlist.push_back(candidates[i]);

        dfs(i,sum-candidates[i],candidates,currlist);

        currlist.pop_back();

        dfs(i+1,sum,candidates,currlist);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {

      vector<int> currlist;
       dfs(0,target,candidates,currlist);
        return ans;
        
    }
};
