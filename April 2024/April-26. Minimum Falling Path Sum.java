April-26. Minimum Falling Path Sum II :
1289.



class Solution {
    public int solveMemo(int[][] grid, int row, int col, int[][] dp) {
        // Base Case
        if (col < 0 || col > grid.length - 1) {
            return 0;
        }
        if (row == grid.length - 1) {
            return grid[row][col];
        }



        // step-2 =>if dp[row][col] is already calculated just return it
        if (dp[row][col] != -1) {
            return dp[row][col];
        }



        // step-3 =>if not calculated yet, then just calculate it and store it in the memoization matrix(dp[row][col])
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            if (i == col) continue;
            ans = Math.min(ans, grid[row][col] + solveMemo(grid, row + 1, i, dp));
        }
        return dp[row][col] = ans;
    }

    public int minFallingPathSum(int[][] grid) {
        if (grid.length == 1) {
            return grid[0][0];
        }

        // step-1 => dp[][] initilization
        int[][] dp = new int[grid.length][grid.length];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            ans = Math.min(ans, solveMemo(grid, 0, i, dp));
        }

        return ans;
    }
}