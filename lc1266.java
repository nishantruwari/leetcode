class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        int n=points.length;

        for(int i=0;i<n-1;i++){
            int diff1=Math.abs(points[i][0]-points[i+1][0]);
            int diff2=Math.abs(points[i][1]-points[i+1][1]);
            sum+=Math.max(diff1,diff2);
        }

        return sum;
        
    }
}
