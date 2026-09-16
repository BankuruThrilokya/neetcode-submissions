class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int num: nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
           queue.offer(new int[]{entry.getValue(), entry.getKey()});
           if(queue.size()>k) {
            queue.poll(); // removes smallest element
           }
        }

        for(int i=0;i<k;i++) {
            result[i] = queue.poll()[1];
        }
        return result;

    }
}
