May-2. Largest Positive Integer That Exists With Its Negative :
2441.



class Solution {
    public int findMaxK(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=0; i--)
        { 
            for(int j=0; j<n; j++)
            {
                if(nums[i]==-nums[j])
                return (nums[i]);
            }
        }
        return -1;
    }
}