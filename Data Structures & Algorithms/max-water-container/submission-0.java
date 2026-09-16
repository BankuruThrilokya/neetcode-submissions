class Solution {
    public int smallest(int num1 , int num2) {
        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public int maxArea(int[] heights) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i< heights.length; i++) {
            for(int j=i+1; j<heights.length; j++) {
              set.add(smallest(heights[i], heights[j]) * (j-i));
            }
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(set.size()-1);
    }
}
