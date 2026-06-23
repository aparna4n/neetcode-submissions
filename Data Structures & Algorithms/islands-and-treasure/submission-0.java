class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                   q.add(new int[]{i, j, 0});
                    visited[i][j]=true;
                }
            }
        }
        
        
        while(q.size()>0){
            int[] curr=q.poll();

            int dist=curr[2];
            int i=curr[0];
            int j=curr[1];
            for(int[] dir:dirs){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0|| y<0 || x>=n || y>=m || visited[x][y] || grid[x][y]==-1){
                    continue;
                }
                visited[x][y]=true;
                grid[x][y]=dist+1;
                q.add(new int[]{x, y, grid[x][y]});;
            }
            
        }
        return;
    }
}
