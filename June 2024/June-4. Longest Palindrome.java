June 4. Longest Palindrome :
409.



public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        int oddFrequencyCount = 0;
        for (char ch : s.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            if (charFrequency.get(ch) % 2 == 1)
                oddFrequencyCount++;
            else
                oddFrequencyCount--;
        }
        if (oddFrequencyCount > 1)
            return s.length() - oddFrequencyCount + 1;
        return s.length();
    }
}