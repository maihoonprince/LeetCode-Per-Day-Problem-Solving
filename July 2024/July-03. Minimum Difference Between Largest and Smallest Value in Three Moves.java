July-03. Minimum Difference Between Largest and Smallest Value in Three Moves :
1509.



class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length, min = Integer.MAX_VALUE;
        if(n <= 3) return 0;
        for(int i=1; i<=4; i++){
            min = Math.min(min, Math.abs(nums[n-i] - nums[4-i]));
        }
        return min;
    }
}