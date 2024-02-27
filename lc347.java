class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int n : nums){
            // if(!map.containsKey(n)){
            //     map.put(n,)
            // }

            map.put(n,map.getOrDefault(n,0)+1);
        }
        //int arr[]=new int[k];
        List<Integer>[] bucket=new List[nums.length+1];
        for(int key: map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        for(int i=bucket.length-1,counter=0;i>=0&&counter<k;i--){
            if(bucket[i]!=null){
                for(Integer l:bucket[i]){
                   // if(l!=0)
                    res[counter++]=l;
                }
            }

        }



       
       return res; 
    }
}