April-6. Minimum Remove to Make Valid Parentheses :
1249.


class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ch=s.toCharArray();
        
        //left to right 
        //)---> (
        int count=0;
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                count++;
            }
            else if(ch[i]==')'){
                if(count>0){
                    count--;
                }
                else{
                    ch[i]=0;
                }
            }
        }
        
        //right->left
        // ( ----> )
        count=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==')'){
                count++;
            }
            else if(ch[i]=='('){
                if(count>0){
                    count--;
                }
                else{
                    ch[i]=0;
                }
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(c!=0){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}