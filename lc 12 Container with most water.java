class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int area;
        for(int i=0,j=height.length-1;i<j;){
            if(height[i]>height[j]){
                
                area=(j-i)*height[j];
                if(area>maxArea)
                     maxArea=area;
                j--;
                //continue;
            }else{
                 area=(j-i)*height[i];
                 if(area>maxArea)
                    maxArea=area;
                i++;
            }
        }
        return maxArea;
        
    }
}
