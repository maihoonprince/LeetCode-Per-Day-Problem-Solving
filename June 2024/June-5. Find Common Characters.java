June-5. Find Common Characters :
1002.





class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> hmap = new HashMap<>();
        String s=words[0];
        //Storing the frequency of each letter in HashMap
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            hmap.put(s.charAt(i),hmap.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++)
        {
            Map<Character,Integer> freq_word = new HashMap<>();
            String new_str = words[i];
            //Storing the frequency of each letter of each word in the array. 
            for(int j=0;j<new_str.length();j++)
            {
                char c =new_str.charAt(j);
                freq_word.put(c,freq_word.getOrDefault(c,0)+1);
            }
            //Comparing and finding the minimum frequency of the each letter in both in the words.
            for(Character key:hmap.keySet())
            {
                if(freq_word.containsKey(key) && hmap.get(key)>0)
                hmap.put(key,Math.min(hmap.get(key),freq_word.get(key)));
                else
                hmap.put(key,0);
            }
        }
        //The loop for array of strings has ended.
        //Creating a List for storing all the characters common to all the word.
        List<String> list = new ArrayList<>();
        for(Character key:hmap.keySet())
        {
            if(hmap.get(key)>0)
            {
                for(int i=0;i<hmap.get(key);i++)
                list.add(key+"");
            }
        }
        return list;
    }
}