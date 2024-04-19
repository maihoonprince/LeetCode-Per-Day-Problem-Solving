April-19. Number of Islands:
200.


class Solution {

    public int numIslands(char[][] grid) {
        int count=0;
     
        for(int  i=0;i<grid.length;i++){
            for(int  j=0;j<grid[0].length;j++){
               if( grid[i][j]=='1'){
                dfs(grid,i,j);
                count++;
               }

            }
        }
        return count;
    }

    public void dfs(char[][]grid , int i ,int j){
        if((i<0 || i >= grid.length ) || (j < 0 || j >= grid[0].length)){
            return ;
        }
        if(grid[i][j]=='0'){
            return;
        }
        if(grid[i][j]=='a'){
            return;
        }
        grid[i][j]= 'a';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}