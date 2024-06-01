June-1. Score of a String :
3110.


class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for(int i=0; i<s.length() - 1; i++){
            total += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return total;
    }
}