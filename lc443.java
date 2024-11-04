class Solution {
    public int compress(char[] chars) {

        int n=chars.length;

        StringBuilder str=new StringBuilder();

        if(n==1) return 1;
        int count=0;

        for(int i=0;i<n;){
            char ch=chars[i];
            count=0;
            

            while(i<n&&ch==chars[i]){
                ++count;
                ++i;
            }

            if(count==1){
                str.append(ch);
            }else{
                str.append(ch);
                str.append(count);
            }
        }

       // char[] ans=new char[str.length()];

        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }

        return str.length();
        
    }
}
