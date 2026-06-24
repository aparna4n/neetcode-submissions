class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    int n,m;
    public void dfs(int i,int j,char[][] grid,boolean[][] visited){
        if(visited[i][j] || grid[i][j]!='1') return;
        visited[i][j]=true;
        grid[i][j]='0';
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x<0 || y<0 || x>=n || y>=m || visited[x][y] || grid[x][y]=='0'){
                continue;
            }
            dfs(x,y,grid,visited);
        }
    }
    public int numIslands(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int ans=0;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return ans;
    }
}
