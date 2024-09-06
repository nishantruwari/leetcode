import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(n%2!=0){
            n=n+1;
        }
        for(Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=n/2){
                return entry.getKey();
            }

        }
        return -1;
        
    }
}
