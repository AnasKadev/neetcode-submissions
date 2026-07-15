class Solution {

     List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       
recur(n,0,0,"");

return res;
    }
 void recur(int n,int open,int close,String bracket){
        
        if(bracket.length()==2*n)
        res.add(bracket);
        
        if(open<n){
            recur(n, open+1, close, bracket+"(");
        }
        if(close<open){
            recur(n, open, close+1, bracket+")");
        }
        
        
        
    }
}
