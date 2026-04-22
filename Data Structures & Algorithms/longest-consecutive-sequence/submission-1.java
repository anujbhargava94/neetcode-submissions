class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <2) return nums.length;
        Set<Integer> numbers = new HashSet<>();

        for(int num: nums){
            numbers.add(num);
        }

        List<Integer> sequence = new ArrayList<>();
        int ans = 1;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int cur =1;
            while(true){
                if(numbers.contains(temp+1)){
                    cur+=1;
                    temp=temp+1;
                }else{
                    if(cur>ans){
                        ans = cur;
                    }
                    break;
                }
            }
        }
        return ans;
        
    }
}
