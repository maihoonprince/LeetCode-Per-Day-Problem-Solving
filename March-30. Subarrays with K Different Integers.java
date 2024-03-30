March-30. Subarrays with K Different Integers :
992.

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return countArray(nums,k)-countArray(nums,k-1);
    }
    private int countArray(int[] nums,int k)
    {
        int count=0;
        int[] occur=new int[nums.length+1];
        int i=0,j=0;int unique=0;
        while(j<nums.length)
        {
            if(occur[nums[j]]==0)
            unique++;
            occur[nums[j]]++;
            while(i<=j&&unique>k)
            {
                occur[nums[i]]--;
                if(occur[nums[i++]]==0)
                unique--;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}