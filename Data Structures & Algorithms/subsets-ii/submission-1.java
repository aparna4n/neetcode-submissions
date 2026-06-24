class Solution {
    int n;
    public void subsetsWithDupHelper(int[] nums,int index,List<Integer> curr,List<List<Integer>> res){
        if(index>=n){
            res.add(new ArrayList<>(curr));
            return;
        }
        //add the curr ele
        curr.add(nums[index]);
        subsetsWithDupHelper(nums,index+1,curr,res);
        curr.remove(curr.size()-1);
        int j=index;
        while(j<n && nums[index]==nums[j]){
            j++;
        }
        subsetsWithDupHelper(nums,j,curr,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        subsetsWithDupHelper(nums,0,curr,res);
        return res;

    }
}
