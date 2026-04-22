class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[][] A =new int[nums.length][2];
        for (int i=0; i<nums.length;i++){
            A[i][0] = nums[i];
            A[i][1] = i;
        }
        Arrays.sort(A, Comparator.comparingInt(a->a[0]));
int i=0;
int j=nums.length-1;
        while(i< nums.length-1 && j>0){
                if(A[i][0]+A[j][0]== target){
                    int[] ans = new int[2];
                    ans[0] = A[i][1];
                    ans[1] = A[j][1];
                    Arrays.sort(ans);
                    return ans;
                }else if(A[i][0]+A[j][0]> target){
                    j--;
                }else{
                    i++;
                }
            
        }
        return new int[0];
    }
}
