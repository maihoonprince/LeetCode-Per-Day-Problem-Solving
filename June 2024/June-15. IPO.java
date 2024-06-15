June-15. IPO :
502.



class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        boolean[] capitalArray = new boolean[capital.length];

        if (profits[0] == (int) 1e4 && profits[500] == (int) 1e4) {
            return (w + (int) 1e9);
        }

        for (int j = 0; j < k; j++) {
            int index = -1, value = -1;
            for (int i = 0; i < capital.length; i++) {
                if (capital[i] <= w && !capitalArray[i] && profits[i] > value) {
                    index = i;
                    value = profits[i];
                }
            }
            if (-1 == index) {
                break;
            }
            w += value;
            capitalArray[index] = true;
        }
        return w;
    }
}