class Solution {
    int n,m;
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};

    public void dfs(char[][] grid,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j]|| grid[i][j]=='0') return;
        visited[i][j]=true;
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            dfs(grid,visited,x,y);
        }
    }
    public int numIslands(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
