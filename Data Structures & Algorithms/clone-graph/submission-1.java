/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> mp=new HashMap<>();
    public Node dfs(Node node){
        if(mp.containsKey(node)) return mp.get(node);
        Node newNode=new Node(node.val);
        mp.put(node,newNode);
        for(Node neighbor:node.neighbors){
            newNode.neighbors.add(dfs(neighbor));
        }
        return newNode;
    }
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        return dfs(node);
    }
}