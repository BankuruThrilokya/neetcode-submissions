class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) { 
          return true;
        }
        String str = "";
        for(char c: s.toCharArray()) {
            if(((int) c >= 65 && (int) c <= 90) ||  //can directly use c>='A' && c<='Z'
               ((int) c >= 97 && (int) c <= 122) ||
                (int) c >= 48 && (int) c <= 57) {
              str = str + (String.valueOf(c));
            }
        }
        String reversed = new StringBuilder(str.toLowerCase()).reverse().toString();
        if(str.toLowerCase().equals(reversed)) {
            return true;
        }
        return false;
    }
}
