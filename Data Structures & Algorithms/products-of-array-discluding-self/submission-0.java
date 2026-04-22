class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] pos = new int[nums.length];
        pre[0] = nums[0];
        pos[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1] *nums[i];
        }

        for(int i=nums.length-2;i>0;i--){
            pos[i] = pos[i+1] *nums[i];
        }

        int[] res = new int[nums.length];
        res[0] = pos[1];
        res[nums.length-1] = pre[nums.length-2];
        for(int i=1; i<nums.length-1;i++){
            res[i] = pre[i-1]*pos[i+1];
        }
        return res;



    }
}  
