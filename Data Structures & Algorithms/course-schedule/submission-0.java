class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] degree=new int[numCourses];
        int n=numCourses;
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] preq:prerequisites){
            degree[preq[1]]++;
            adjList.get(preq[0]).add(preq[1]);
        }
        //bfs
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        int count=0;
    
        while(q.size()>0){
            int curr=q.poll();
            count++;
            for(int nei:adjList.get(curr)){
                degree[nei]--;
                if(degree[nei]==0){
                    q.add(nei);
                }
            }

        }
        return count==numCourses;
        
    }
}
