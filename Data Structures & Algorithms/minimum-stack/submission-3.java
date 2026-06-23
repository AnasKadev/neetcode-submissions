class MinStack {
    
    Stack<Integer> s = new Stack<>();
    Stack<Integer> m = new Stack<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(  m.isEmpty() || val<=m.peek())
        m.push(val);
        
        
    }
    
    public void pop() {
        if (s.isEmpty()) 
        return;
        int top=s.pop();
        if(top==m.peek()){

        m.pop();
        }
        
        
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}
