May-22. Palindrome Partitioning :
131.



class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        solve(s, result, new LinkedList<>(), 0);
        return result;
    }

    public void solve(String s, List<List<String>> result, List<String> toAdd, int index){
        if(index == s.length()){
            result.add(new LinkedList<>(toAdd));
            return;
        }
        for(int i=index; i<s.length(); i++){
            String substring = s.substring(index, i+1);
            if(isPalindrome(substring)){
                toAdd.add(substring);
                solve(s, result, toAdd, i+1);
                toAdd.remove(toAdd.size()-1);
            }
        }
    }

    public boolean isPalindrome(String str){
        int i=0;
        int j=str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}