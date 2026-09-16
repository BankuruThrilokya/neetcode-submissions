class Solution {
    boolean linearSearch(int[] arr, int key) {
            for(int i=0;i<arr.length;i++) {
              if(arr[i] == key) {
                return true;
              }
            }
            return false;
        }
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        if(nums.length == 0) {
            longest = 0;
            return longest;
        }
        for(int i=0;i<nums.length;i++) {
            int x = nums[i];
            int count = 1;
            while(linearSearch(nums,x+1) == true) {
                count++;
                x++;
            }
        if(count > longest) {
           longest = count;
        }
        }
        return longest;
    }
}
