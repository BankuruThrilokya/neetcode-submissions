class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int num: nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        int longest =  1;
        for(int i=0;i<list.size();i++) {
            int count = 1;
            if(!list.contains(list.get(i)-1)) {
                int x=list.get(i)+1;
              while(list.contains(x)) {
                x++;
                count++;
              }
            }
            if(count > longest) {
                longest = count;
            }
        }
        return longest;
    }
}
