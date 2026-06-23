class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        HashSet<String> op=new HashSet<>();
        op.add("+");
         op.add("-");
          op.add("/");
           op.add("*");
           Stack<Integer> stack=new Stack<>();
           for(String str: tokens){
            if(!op.contains(str)){
                stack.push(Integer.parseInt(str));
                res=stack.peek();
            }else {
                if(str.equals("+")){
                    stack.pop();
                    res=res+stack.pop();
                    
                    stack.push(res);
                }
                 if(str.equals("-")){
                    stack.pop();
                    res=stack.pop()-res;
                    
                    stack.push(res);
                }
                 if(str.equals("*")){
                    stack.pop();
                    res=res*stack.pop();
                    
                    stack.push(res);
                }
                 if(str.equals("/")){
                    stack.pop();
                    res=stack.pop()/res;
                    
                    stack.push(res);
                }
            }
           }
           return res;
    }
}