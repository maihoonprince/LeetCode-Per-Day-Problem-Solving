May-14. Path with Maximum Gold :
1219.




class Solution {
    int[] roww = {1, -1, 0, 0};
    int[] coll = {0, 0, -1, 1};

    public int backtrack(int[][] grid, int[][] vis, int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0 || vis[x][y] == 1) return 0;

        vis[x][y] = 1;
        int maxGold = grid[x][y];

        for (int i = 0; i < 4; i++) {
            int newX = x + roww[i];
            int newY = y + coll[i];
            maxGold = Math.max(maxGold, grid[x][y] + backtrack(grid, vis, newX, newY, n, m));
        }

        vis[x][y] = 0;
        return maxGold;
    }

    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int maxGold = 0;
        int[][] vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, backtrack(grid, vis, i, j, n, m));
                }
            }
        }

        return maxGold;
    }
}