May-9. Maximize Happiness of Selected Children :
3075.

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        Stack<Integer> stack = new Stack <>();
        for(int nums : happiness){
            stack.add(nums);
        }
        long max = 0;
        int i = 0;
        while(k-- != 0 && !stack.isEmpty()){
            int curr = stack.pop();
            if((curr - i) > 0){
                max += (curr - i);
            }
            i++;
        }
        return max;
    }
}