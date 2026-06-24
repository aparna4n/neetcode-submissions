class Solution {
    int n;
    public void combinationSum2Helper(int[] candidates,int index,List<Integer> curr,List<List<Integer>> res,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || index>=n) return;
        // add the curr ele
        curr.add(candidates[index]);
        combinationSum2Helper(candidates,index+1,curr,res,target-candidates[index]);
        curr.remove(curr.size()-1);

        // ignore the curr ele
        int j=index;
        while(j<n && candidates[j]==candidates[index]){
            j++;
        }
        combinationSum2Helper(candidates,j,curr,res,target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        n=candidates.length;
        Arrays.sort(candidates);
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        combinationSum2Helper(candidates,0,curr,res,target);
        return res;
    }
}
