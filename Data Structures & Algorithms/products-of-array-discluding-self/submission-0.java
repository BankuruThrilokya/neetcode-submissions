class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nums1[] = new int[nums.length];
        Arrays.fill(nums1,1);
        Map<Integer, Integer> index = new HashMap<>();
        for( int i=0;i<nums.length;i++) {
          index.put(i,nums[i]);
        }
        for(int j=0;j<nums.length;j++) {
          for (Map.Entry<Integer, Integer> entry : index.entrySet()) {
            if(entry.getKey()!=j) {
              nums1[j] = nums1[j]*entry.getValue();
            }
          }
        }
        return nums1;
    }
}  
