class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] results = new int[len];
        for(int i=len-1; i>=0;i--){
            while(!stack.isEmpty()
            && (temperatures[stack.peek()]<temperatures[i] ||
            temperatures[stack.peek()]==temperatures[i])){
                stack.pop();
            }
            if(stack.isEmpty()){
                results[i]=0;
                stack.add(i);
            }else{
                int j = stack.peek();
                results[i] = j-i;
                stack.add(i);
            }
        }
        return results;
    }
}

/*
        int[] results = new int[temperatures.length];
        for(int i=0; i<temperatures.length;i++){
            int j=i+1;
            while(j<temperatures.length
            && (temperatures[i]==temperatures[j]
            || temperatures[i]>temperatures[j]))
            {
                j++;
            }
            if(j<temperatures.length){
                results[i] = j-i;
            }else{
                results[i] = 0;
            }
        }
        return results;
    }

    */

