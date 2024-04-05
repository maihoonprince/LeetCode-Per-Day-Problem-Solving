April-5. Make The String Great:
1544.

class Solution {
    public String makeGood(String s) {
        for(int i=0; i<s.length()-1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 32)
            return makeGood(s.substring(0, i) + s.substring(i+2));
        }
        return s;
    }
}