class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            Set<Integer> visited=new HashSet<>();
            if(!dfs(u,-1,adj,visited)) return edge;
        }
        return new int[0];
    }
    public boolean dfs(int node,int parent,List<List<Integer>> adj,Set<Integer> visited){
        if(visited.contains(node)) return false;
        visited.add(node);
        for(int nei:adj.get(node)){
            if(nei==parent) continue;
            if(!dfs(nei,node,adj,visited))
            return false;
        }
        return true;
    }
}
