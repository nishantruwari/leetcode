class Solution {
    public String getfreq(String s){
        int fr[]=new int[26];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder("");
        char ch='a';

        for(int f:fr){
            str.append(ch);
            str.append(f);
            ch++;
        }
        return str.toString();

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
       for(String s :strs){
           String freqorder=new String(getfreq(s));
           if(!map.containsKey(freqorder)){
            map.put(freqorder,new LinkedList<String>());
            }
            map.get(freqorder).add(s);
       }
       return new LinkedList<>(map.values());
        
}
}