class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> seen = new HashMap<>();

        int i=0;
        for(int num : nums){
            if(seen.containsKey(target-num)){
                int j=seen.get(target-num);
                if(i!=j){
                    if(i>j)
                    return new int[]{j, i};
                    else return new int[]{i, j};
                }
            }else{
                seen.put(num,i);
            }
            i++;
        }
        return new int[]{-1,-1};

    }
}
