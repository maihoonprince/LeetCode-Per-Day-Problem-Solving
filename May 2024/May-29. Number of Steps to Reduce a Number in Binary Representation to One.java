May-29. Number of Steps to Reduce a Number in Binary Representation to One :
1404.




class Solution {
    public int numSteps(String s) {
       int count = 0;
        int carry = 0;
        
        for(int i = s.length() - 1; i >= 1; i--) {
            int num = s.charAt(i) - '0';
            
            // most right is 0 and carry is 0 so ->even - one operation
            if(num == 0 && carry == 0) {
                count++;
            } else if(num == 1 && carry == 1) { // most right is 1 and carry is 1 so *1 + 1 ->even - one operation
                count++;
                carry = 1; // carry is used so becomes 0
            } else { // else is about num is 0 and carry is 1. most right is 0(even), but carry is 1 even + 1 ->odd - two operations
                count+= 2;
                carry = 1; // carry is used so becomes 0
            }
        }
        
        // now we are at 1st digit in s, and we know 1st digit in s is 1 -> our goal is here. 
        // but if at this moment, if carry is 1, then total is 2 now. we need one more divide operation.(if carry is 0, then no need)
        
        if(carry == 1) count++;
        
        return count;
    }
}