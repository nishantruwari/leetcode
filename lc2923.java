class Solution {
    public int findChampion(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    ++count;
                }

            }
            if(count==1){
                return i;
            }
        }

        return -1;
        
    }
}
