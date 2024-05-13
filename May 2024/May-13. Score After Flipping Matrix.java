May-13. Score After Flipping Matrix :
861.


class Solution {
    public int matrixScore(int[][] grid) {
        int score = 0;
        boolean[] rowFlipped = new boolean[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int current = 0;
            int flipped = 0;
            for (int j = 0; j < grid[i].length; j++) {
                current <<= 1;
                flipped <<= 1;
                current += grid[i][j];
                flipped += grid[i][j] == 0 ? 1 : 0;
            }
            rowFlipped[i] = current < flipped;
            score += Math.max(current, flipped);
        }
        for (int i = 0; i < grid[0].length; i++) {
            int count = 0;
            for (int j = 0; j < grid.length; j++) {
                count += rowFlipped[j] ? grid[j][i] == 0 ? 1 : 0 : grid[j][i];
            }
            if (count < (grid.length - count)) {
                score += ((grid.length - count) - count) * (1 << grid[0].length - 1 - i);
            }
        }
        return score;
    }
}