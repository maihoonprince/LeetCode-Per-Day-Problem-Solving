May-8. Relative Ranks :
506.



class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->(b-a));
        int n= score.length;
        for(int i=0;i<n;i++){
            p.offer(score[i]);
        }
        String [] s=new String[p.peek()+1];
        String [] s1=new String[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                s[p.poll()]="Gold Medal";
            }else if(i == 1){
                s[p.poll()]="Silver Medal";
            }else if(i == 2){
                s[p.poll()]="Bronze Medal";
            }else{
                s[p.poll()]=String.valueOf(i+1);
            }
        }
        for(int i=0;i< n;i++){
            s1[i]=s[score[i]];
        }

       return s1;
    }
}