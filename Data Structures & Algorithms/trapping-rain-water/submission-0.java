class Solution {
    public int trap(int[] height) {

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int max = 0; 
        for(int i=0; i<height.length; i++){
            if(height[i]>max){
                left[i] = 0;
                max = height[i];
            }
            else{
                left[i] = max - height[i];
            }
        }

        max = 0; 
        for(int i=height.length-1; i>0; i--){
            if(height[i]>max){
                right[i] = 0;
                max = height[i];
            }
            else{
                right[i] = max - height[i];
            }
        }

        int res = 0;
        for(int i=0; i<height.length;i++){
            res = res + Math.min(left[i], right[i]);
        }
        return res;

        
    }
}
