class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for(int num: nums) {
           duplicates.add(num);
        }
        if(duplicates.size() != nums.length) {
          return true;          
        }
        return false;
    }
}