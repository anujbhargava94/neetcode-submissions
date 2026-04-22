class MinStack {

     Stack<Long> stack;
     long min;
    public MinStack() {
        stack = new Stack<>();
        min = 0L;
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = Long.valueOf(val);
        }else{
            stack.push(val-min);
            if(min>val) min = val;
        }
    }
    
    public void pop() {
        long popped = stack.pop();
        if(popped<0) min = min - popped;
    }
    
    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int) (top + min);
        } else {
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
