class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int empty=0;
        int m=flowerbed.length;
        if(m==1){
            if(flowerbed[0]==1){
                return 0>=n;
            }else {
                return 1>=n;
            }
        }
        int count=0;

        for(int i=0;i<m;i++){

            if(i==0 && flowerbed[i]==0){
                if(flowerbed[i+1]==0){
                    ++count;
                    flowerbed[i]=1;
                }
            }else  if(i==m-1 && flowerbed[i]==0){
                if(flowerbed[i-1]==0){
                    ++count;
                    flowerbed[i]=1;
                }
            }else if(flowerbed[i]==0){
                 if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                    ++count;
                    flowerbed[i]=1;
                }
                
            }

        }
       // System.out.println(count);

        return count>=n;
        
    }
}
