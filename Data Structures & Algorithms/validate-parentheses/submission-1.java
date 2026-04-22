class Solution {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        char[] charS = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< charS.length; i++){
            char current = charS[i];
            if (isOpenB(current)){
                stack.push(current);
            } else {
                if(stack.isEmpty()) return false;
                char popped = stack.pop();
                if(!validate(current, popped)){
                    return false;
                }
            }
        }
        return stack.size() ==0;
    }

    boolean validate(char c, char popped){
        switch(c){
            case '}':
                {return popped == '{';}
            case ')':
                {return popped == '(';}
            case ']':
                {return popped == '[';}
            default:
                {return false;}
        }
    }

    boolean isOpenB(char c){
        return c =='(' || c == '{' || c == '[';
    }
}
