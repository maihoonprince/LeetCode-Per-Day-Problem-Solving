May-20. Sum of All Subset XOR Totals :
1863.



class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    public int helper(int nums[], int level, int currentXOR){

        if(level == nums.length) return currentXOR;

        int inc = helper(nums, level + 1, currentXOR^nums[level]);
        int exc = helper(nums, level + 1, currentXOR);

        return inc + exc;
    }
}