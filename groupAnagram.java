class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s:strs){
            char cArr[]=s.toCharArray();
            Arrays.sort(cArr);
            String sorted=new String(cArr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
                map.get(sorted).add(s);
            
        }
        return new LinkedList<>(map.values());
    }
}