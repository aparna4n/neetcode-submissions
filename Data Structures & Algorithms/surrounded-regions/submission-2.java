class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public void solve(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] visited=new boolean[n][m];

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(grid[i][0]=='O' && !visited[i][0]){
                visited[i][0]=true;
                grid[i][0]='S';
                q.add(new int[]{i,0});
            }
            if(grid[i][m-1]=='O' && !visited[i][m-1]){
                visited[i][m-1]=true;
                grid[i][m-1]='S';
                q.add(new int[]{i,m-1});
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]=='O' && !visited[0][i]){
                visited[0][i]=true;
                grid[0][i]='S';
                q.add(new int[]{0,i});
            }
            if(grid[n-1][i]=='O' && !visited[n-1][i]){
                visited[n-1][i]=true;
                grid[n-1][i]='S';
                q.add(new int[]{n-1,i});
            }
        }

     while(q.size()>0){
            int[] curr=q.poll();
            int i=curr[0];
            int j=curr[1];
            for(int[] dir:dirs){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0 || y<0 || x>=n || y>=m|| visited[x][y] || grid[x][y]!='O'){
                    continue;
                }
                q.add(new int[]{x,y});
                visited[x][y]=true;
                grid[x][y]='S';
            }
        }


    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='S'){
                grid[i][j]='O';
            }else{
                grid[i][j]='X';
            }
           
        }
    }

    }

}
