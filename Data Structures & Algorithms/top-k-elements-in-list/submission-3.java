class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int num: nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
           queue.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        for(int i=0;i<k;i++) {
            result[i] = queue.poll()[1];
        }
        return result;

    }
}

