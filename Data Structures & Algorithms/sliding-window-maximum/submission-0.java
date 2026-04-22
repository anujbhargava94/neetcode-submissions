class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length-k+1]; 
        int j=0;
        int max = 0;
        for(int i=0; i<=nums.length-k;i++)
        {
            j=i+k-1;
            max = nums[i];
            while(j>i){
                max = Math.max(max, nums[j]);
                j--;
            }
            ans[i] = max;
        }
        return ans;
        
    }
}
