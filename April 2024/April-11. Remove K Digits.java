April-11. Remove K Digits :
402.

class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> stack = new Stack <>();
        for(char ch : num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek() > ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return (sb.length() > 0) ? sb.toString() : "0";
    }
}