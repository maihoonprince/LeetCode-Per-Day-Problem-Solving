June-8. Continuous Subarray Sum :
523.


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
/* int pro = nums[0];
        int i = 0, j = 1;
        while (j < nums.length) {
            if(pro<k){
                pro *= nums[j];
                j++;
            }
           else if (pro % k > 0) {
                pro /= nums[i];
                i++;
            } else if (pro % k == 0 && j - i >= 1) {
                return true;
            }
        }
        return false;
        */
         Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1); // To handle the case where the subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (remainderIndexMap.containsKey(remainder)) {
                if (i - remainderIndexMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderIndexMap.put(remainder, i);
            }
        }

        return false;
    }
}