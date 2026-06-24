class Solution {
    public int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] visited=new boolean[n][m];

        Queue<int[]> q=new LinkedList<>();
        boolean isFreshFruit=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j]=true;
                    q.add(new int[]{i,j,0});
                }
                else if(grid[i][j]==1){
                    isFreshFruit=true;
                }
            }

        }
        if(!isFreshFruit) return 0;
        int ans=-1;
        while(q.size()>0){
            int[] curr=q.poll();
            int dist=curr[2];
            int i=curr[0];
            int j=curr[1];
            for(int[] dir:dirs){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0 || y<0 || x>=n || y>=m || visited[x][y] || grid[x][y]==0){
                    continue;
                }
                visited[x][y]=true;
                q.add(new int[]{x,y,dist+1});
                grid[x][y]=2;
                ans=Math.max(ans,dist+1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans;
    }
}
