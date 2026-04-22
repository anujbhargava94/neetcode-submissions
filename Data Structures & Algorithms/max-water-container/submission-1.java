class Solution {
    public int maxArea(int[] heights) {
        int l=0; //
        int r = heights.length-1; //7
        int max = 0;
        while(l<r){
            int cap = (r-l)*Math.min(heights[l], heights[r]);
            if(cap>max){max = cap;}
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
