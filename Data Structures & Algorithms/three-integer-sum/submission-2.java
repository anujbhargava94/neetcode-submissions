class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            int target = 0-nums[i];
            int j=i+1;
            int k=nums.length -1;
            while(j<k){
                if(j == i){j++;}
                if(k == i){k--;}
                int sum = nums[j]+nums[k];
                if(sum == target){
                    List<Integer> temp = 
                    new ArrayList<>(Arrays.asList(nums[i],
                    nums[j],
                    nums[k]));
                    Collections.sort(temp);
                    res.add(temp);
                    j++;
                    k--;
                }
                else if(sum>target){
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
