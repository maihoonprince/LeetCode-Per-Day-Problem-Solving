June-7. Replace Words :
648.



class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Dictionary dict = new Dictionary();

        dictionary.stream().forEach(dict::addWord);

        String[] words = sentence.split("\\s+");

        for(int i = 0; i < words.length; ++i) {
            words[i] = dict.getRoot(words[i]);
        }

        return String.join(" ", words);
    }

    private class Letter {
        public boolean isWord = false;
        public Letter[] children;

        public Letter() {
            this.children = new Letter[26];
        }
    }

    private class Dictionary {
        private Letter dummy;

        public Dictionary() {
            this.dummy = new Letter();
        }

        public void addWord(String word) {
            Letter curr = dummy;

            for(int i = 0; i < word.length(); ++i) {
                int index = word.charAt(i) - 'a';

                if(curr.children[index] == null)
                    curr.children[index] = new Letter();

                curr = curr.children[index];
            }

            curr.isWord = true;
        }

        public String getRoot(String word) {
            Letter curr = dummy;
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < word.length() && curr != null; ++i) {
                int index = word.charAt(i) - 'a';
                
                curr = curr.children[index];

                if(curr != null) {
                    sb.append(word.charAt(i));

                    if(curr.isWord)
                        return sb.toString();
                }
            }

            return word;
        }
    }
}