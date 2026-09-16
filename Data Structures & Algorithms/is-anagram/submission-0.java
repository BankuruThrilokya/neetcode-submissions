class Solution {
    public boolean isAnagram(String s, String t) {
      char sSort[] = s.toCharArray();
      char tSort[] = t.toCharArray();

      if(s.length() != t.length()) {
        return false;
      }
    
      Arrays.sort(sSort);
      Arrays.sort(tSort);
      
      return Arrays.equals(sSort, tSort);
    }
}
