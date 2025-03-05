class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;

        Set<Character> set=new HashSet<>();

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }else{
                max=Math.max(right-left,max);
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                ++left;

            }
            ++right;
        }
        max=Math.max(right-left,max);
        return max;
        
    }
}
