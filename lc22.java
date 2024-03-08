class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generateValid("(",1,0,res,n);
        return res;

        
        
    }
     public void generateValid(String s,int op,int cl,List<String> res, int n){
       if(s.length()==2*n){
           res.add(s);
           return;

       }
       
        if(op<n){
            generateValid(s+"(",op+1,cl,res,n);
        }
        if(cl<op){
            generateValid(s+")",op,cl+1,res,n);
        }
    }
}