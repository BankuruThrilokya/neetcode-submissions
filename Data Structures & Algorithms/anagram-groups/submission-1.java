class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s: strs) {
          int[] count = new int[26];
          for(char c: s.toCharArray()) {
            count[c -'a']++;
          }
          // convert back to string
          String sorted = Arrays.toString(count);
          result.putIfAbsent(sorted,new ArrayList<>());
          result.get(sorted).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
