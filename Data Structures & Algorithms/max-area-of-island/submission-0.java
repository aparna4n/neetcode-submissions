class Solution {
    int n,m;
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public int dfs(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || grid[i][j]==0) return 0;
        int ans=1;
        visited[i][j]=true;
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            ans+=dfs(grid,visited,x,y);
        }
        return ans;

    }
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    res=Math.max(res,dfs(grid,visited,i,j));
                }
            }
        }
        return res;
    }
}
