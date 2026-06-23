class Solution {
    int n,m;
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n=heights.length;
        m=heights[0].length;
        boolean[][] pac=new boolean[n][m];
        boolean[][] atl=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        //first we will find for pac
        for(int i=0;i<m;i++){
            q.add(new int[]{0,i,heights[0][i]});
            pac[0][i]=true;
        }
        for(int i=1;i<n;i++){
            q.add(new int[]{i,0,heights[i][0]});
            pac[i][0]=true;
        }
        bfs(heights,pac,q);
        q.clear();
        for(int i=0;i<m;i++){
            q.add(new int[]{n-1,i,heights[n-1][i]});
            atl[n-1][i]=true;
        }
        for(int i=0;i<n;i++){
            if(!atl[i][m-1]){
                q.add(new int[]{i,m-1,heights[i][m-1]});
                atl[i][m-1]=true;
            }
        }
        bfs(heights,atl,q);
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(atl[i][j] && pac[i][j]){
                    System.out.print("| true |");
                    ans.add(new ArrayList<>(Arrays.asList(i,j)));
                }else{
                  System.out.print("| false |");  
                }
            }
            System.out.println();
        }
        return ans;

    }
    public void bfs(int[][] heights,boolean [][] visited,Queue<int[]> q){
        while(q.size()>0){
            int[] curr=q.poll();
            int i=curr[0];
            int j=curr[1];
            int val=curr[2];

            for(int[] dir:dirs){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0 || y<0 || x>=n || y>=m || visited[x][y]|| heights[x][y]<val) continue;
                visited[x][y]=true;
                q.add(new int[]{x,y,heights[x][y]});
            }

        }
        
    }
}
