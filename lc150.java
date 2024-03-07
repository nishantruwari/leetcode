class Solution {
    public int evalRPN(String[] str) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals("+")||str[i].equals("*")||str[i].equals("/")||str[i].equals("-")){
                int num2=stack.pop();
                int num1=stack.pop();
                 if(str[i].equals("+")){
                     stack.push(num1+num2);
                 }else if(str[i].equals("*")){
                     stack.push(num1*num2);
                 }else if(str[i].equals("/")){
                     stack.push(num1/num2);
                 }else if(str[i].equals("-")){
                     stack.push(num1-num2);
                 }
                 

            }else{
                stack.push(Integer.parseInt(str[i]));
            }
        }
         return stack.pop();

        
    }
}