class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] aux=new int[n];
        aux[n-1]=prices[n-1];
        int max=0;
        for(int i=n-2;i>=0;i--){
            aux[i]=Math.max(prices[i],aux[i+1]);
            System.out.println(aux[i]);
            max=Math.max(-prices[i]+aux[i],max);
        }

        return max;
        
    }
}
