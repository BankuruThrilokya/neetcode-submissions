class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
          char[] charArray = strs[i].toCharArray();
          Arrays.sort(charArray);
          String sorted = new String(charArray);
          if(!result.containsKey(sorted)) {
            result.put(sorted, new ArrayList<>());
          }
          result.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(result.values());
    }
}
