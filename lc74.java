class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //bruteforce method
       /* for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false; */

        //lets makes it more efficient by searching only that row which might contain the target. It would
        // It would be more efficient since it need not to search for the entire matrix hence less comparison.
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][matrix[0].length-1]){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==target){
                    return true;
                }
                
            }
            return false;
            }
            
        }
        return false;

    }
}