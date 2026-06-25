class Solution {
    public void dfs(boolean[] visited,Map<Integer,List<Integer>> mp,int n){
        if(visited[n]) return;

        visited[n]=true;
        List<Integer> temp=mp.get(n);
        
        if(temp!=null){
            for(int node:temp){
            dfs(visited,mp,node);
        }
        }
    }
    public int countComponents(int n, int[][] edges) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int[] edge:edges){
            int first=edge[0];
            int second=edge[1];
            if(!mp.containsKey(first)){
                mp.putIfAbsent(first, new ArrayList<>());
            } mp.get(first).add(second);
            if(!mp.containsKey(second)){
                mp.putIfAbsent(second, new ArrayList<>());
            }
            mp.get(second).add(first);
        }
        int count = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {

            if(visited[i]) continue;

            dfs(visited, mp, i);
            count++;
        }
        return count;
    }
}
