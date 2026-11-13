class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> resultMap = new HashMap();
       if(s.length() != t.length()) {
        return false;
       }
       for(char c: s.toCharArray()) {
         resultMap.put(c, resultMap.getOrDefault(c, 0)+1);
       }

       for(char c: t.toCharArray()) {
        if(resultMap.containsKey(c)) {
            resultMap.put(c, resultMap.get(c)-1);
        }
       }

       for(int value: resultMap.values()) {
        if(value!=0) {
            return false;
        }
       }
       return true;
    }
}
