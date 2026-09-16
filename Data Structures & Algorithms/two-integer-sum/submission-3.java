class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];
      Map<Integer, Integer> twoSum = new HashMap<>();
      for(int i=0;i<nums.length;i++) {
        int diff = target - nums[i];
        if(twoSum.containsKey(diff)){
          result[0] = twoSum.get(diff);
          result[1] = i;
        }
        else {
          twoSum.put(nums[i], i);
        }
      }
      return result;
    }
}
