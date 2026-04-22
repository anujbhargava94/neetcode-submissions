class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int[] res = new int[k];
        for (int i=0; i<nums.length;i++){
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)-> b[0]-a[0]);

        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            heap.offer(new int[]{entry.getValue(),entry.getKey()});
            
        }

        for (int i=0; i<k;i++){
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
