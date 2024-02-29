class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],false);
        }
        int currlen=0,maxlen=0;
        for(int i=0;i<nums.length;i++){
            currlen=1;
            int next=nums[i]+1;
            while(map.containsKey(next)&& map.get(next)==false){
                currlen++;
                map.put(next,true);
                next++;
            }
            int prev=nums[i]-1;
            while(map.containsKey(prev)&& map.get(prev)==false){
                currlen++;
                map.put(prev,true);
                prev--;
            }

            maxlen=Math.max(currlen,maxlen);
            //++maxlen;

        }
        //if(nums.length==0)
       // return 0;
        return maxlen;

        
    }
}