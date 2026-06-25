class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int[] degree=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] preq:prerequisites){
            int course=preq[0];
            int prere=preq[1];
            degree[course]++;
            adj.get(prere).add(course);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        int completedCourse=0;
        int[] res=new int[n];
        int i=0;
        while(q.size()>0){
            int curr=q.poll();
            res[i]=curr;
            i++;
            completedCourse++;
            List<Integer> nei=adj.get(curr);
            for(int course:nei){
                degree[course]--;
                if(degree[course]==0){
                    q.add(course);
                }
            }
        }
        if(completedCourse==n){
            return res;
        }
        return new int[]{};
    }
}
