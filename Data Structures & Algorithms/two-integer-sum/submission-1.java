class Solution {
    public int[] twoSum(int[] nums, int target) {
      int nums1[] = new int[2];
      for(int i=0;i<nums.length;i++) {
        for(int j=i+1;j<nums.length;j++) {
          if(nums[i]+nums[j] == target && i!=j) {
            nums1[0] = i;
            nums1[1] = j;
            break;
          }
        }
      }
      return nums1;
    }
}
