class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        

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
}
