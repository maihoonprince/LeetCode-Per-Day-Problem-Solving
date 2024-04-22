April-22. Open the Lock :
752.



class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadendCodes = new HashSet<>();
        for (String deadend : deadends) {
            deadendCodes.add(deadend);
        }
        
        if ("0000".equals(target)) return 0;
        if (deadendCodes.contains("0000")) return -1;
        
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>("0000", 0));
        
        boolean[] visited = new boolean[10000];
        visited[0] = true;
        
        while (!q.isEmpty()) {
            Pair<String, Integer> pair = q.poll();
            String currCode = pair.getKey();
            int currTurns = pair.getValue();
            
            if (currCode.equals(target)) return currTurns;
            
            for (int i = 0; i < 4; i++) {
                char[] codeArray = currCode.toCharArray();
                char originalDigit = codeArray[i];
                
                for (int j = -1; j <= 1; j += 2) {
                    char modifiedDigit = (char)(((originalDigit - '0' + j + 10) % 10) + '0');
                    codeArray[i] = modifiedDigit;
                    String nextCode = new String(codeArray);
                    
                    if (!visited[Integer.parseInt(nextCode)] && !deadendCodes.contains(nextCode)) {
                        visited[Integer.parseInt(nextCode)] = true;
                        q.offer(new Pair<>(nextCode, currTurns + 1));
                    }
                }
                
                codeArray[i] = originalDigit;
            }
        }
        
        return -1;
    }
}