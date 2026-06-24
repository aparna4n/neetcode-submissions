class Solution {
    int n;
    
    public void permuteHelper(int[] nums,boolean[] visited,int count,List<Integer> curr,List<List<Integer>> res){
        if(count==n){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            visited[i]=true;
            curr.add(nums[i]);
            permuteHelper(nums,visited,count+1, curr,res);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        n=nums.length;
        boolean[] visited=new boolean[n];
        int count=0;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        permuteHelper(nums,visited,0,curr,res);
        return res;

    }
}
