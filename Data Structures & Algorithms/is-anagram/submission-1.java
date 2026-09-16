class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length()) {
      return false;
     }
     // creates an array with length 26 having default values 0
     int[] counts = new int[26];

     for(int i=0;i<s.length();i++) {
       // s.charAt(i) --> 'r' = 114(ASCII) --> 114-97 = 17 
       // counts[17] changes from 0 to value counts[17]++ = 1
       // whereas t decrements so making it 0
       counts[s.charAt(i) - 'a']++;
       counts[t.charAt(i) - 'a']--;
     }
     // if all values of an counts array zero, then anagram else false
     for (int count: counts) {
       if(count!=0) return false;
     }
     return true;
    }
}
