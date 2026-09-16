class Solution {
    int max(int num1, int num2) {
        if(num1>num2) {
            return num1;
        }
        return num2;
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        if(nums.length == 0 ){
            return 0;
        }
        int lastSmaller = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]-1 == lastSmaller) {
                count++;
                lastSmaller = nums[i];
            }
            else if(nums[i] != lastSmaller) {
                count = 1;
                lastSmaller = nums[i];
            }
            longest = max(longest, count);
        }
        return longest;
    }
}
