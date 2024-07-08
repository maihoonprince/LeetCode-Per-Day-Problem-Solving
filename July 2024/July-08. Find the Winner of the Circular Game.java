July-08. Find the Winner of the Circular Game:
1823.


class Solution {
    public int solve(int n, int k){
        if(n == 1){
            return 0;
        }
        return (solve(n-1, k) + k) % n;
    }

    public int findTheWinner(int n, int k) {
        int ans = solve(n, k) + 1;
        return ans;
    }
}