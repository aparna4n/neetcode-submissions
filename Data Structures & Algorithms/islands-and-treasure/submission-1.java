class Solution {
    int[][] dirs={{0,1},{-1,0},{1,0},{0,-1}};
    int n,m;

    public void islandsAndTreasure(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        //bfs
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }
        while(q.size()>0){
            int[] curr=q.poll();
            int i=curr[0],j=curr[1];
            int dist=curr[2];
            for(int[] dir:dirs){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0 || y<0 || x>=n || y>=m || visited[x][y]|| grid[x][y]==-1) continue;
                visited[x][y]=true;
                grid[x][y]=dist+1;
                q.add(new int[]{x,y,grid[x][y]});
            }
        }
        return;
    }
}
