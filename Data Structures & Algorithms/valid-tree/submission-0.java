class Solution {
    public boolean dfs(int node,int parent,Set<Integer> visited,List<List<Integer>> adj){
        if(visited.contains(node)) return false;
        visited.add(node);
        for(int nei:adj.get(node)){
            if(nei==parent) continue;
            if(!dfs(nei,node,visited,adj)){
                return false;
            }
        }
        return true;
    }
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        if(edges.length>n-1) return false;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Set<Integer> visited=new HashSet<>();
        if(!dfs(0,-1,visited,adj)){
            return false;
        }
        return visited.size()==n;

    }
}
