class Solution {
    public void moveZeroes(int[] arr) {
        int count=0;
        int n=arr.length;
        
        for(int i=0,j=0;i<n;i++){
            if(arr[i]==0){
                count++;

            }
            
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(count>0){
            arr[j]=0;
            j++;
            --count;
        }
        
    }
}
