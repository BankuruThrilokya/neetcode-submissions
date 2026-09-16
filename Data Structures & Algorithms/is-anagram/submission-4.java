class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
      }
      for(int i=0;i<t.length();i++) {
        int count = map.getOrDefault(t.charAt(i),0);
        if(count==0) return false;
        else {
          map.put(t.charAt(i), count-1);
        }
      }
      for (int value: map.values()) {
        if(value != 0){
          return false;
        }
      }
      return true;
    }
}
