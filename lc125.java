class Solution {
    public boolean isAlphanumeric(char ch){
        if(ch>='0'&ch<='9'||ch>='a'&ch<='z'||ch>='A'&ch<='Z'){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int flag=0;
        Boolean ans=false;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            
            while(!isAlphanumeric(s.charAt(i))){
                i++;
                if(i>j) {
                    if(flag==1&&!ans)
                    return false;
                    else 
                    return true;
                }
            }
            flag=1;
            while(!isAlphanumeric(s.charAt(j))){
                j--;
               
            }
            if(flag==0){
                return true;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                ans=true;
            }
        
        }
        return true;
        
    }
}