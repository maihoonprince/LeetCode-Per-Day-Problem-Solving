June-17. Sum of Square Numbers :
633.


class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a=0; a*a <= c; a++){
            double b = Math.sqrt(c - a*a);
            if(b == (int)b){
                return true;
            }
        }
        return false;
    }
}