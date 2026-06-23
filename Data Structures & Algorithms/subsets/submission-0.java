class Solution {
    int n;
    void SubsetHelper(int[] nums,int index,List<Integer> curr,List<List<Integer>> ans){
        if(index>=n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //add the curr contribution
        curr.add(nums[index]);
        SubsetHelper(nums,index+1,curr,ans);
        curr.remove(curr.size()-1);
        SubsetHelper(nums,index+1,curr,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
     n=nums.length;
     List<Integer> curr=new ArrayList<>();
     List<List<Integer>> ans=new ArrayList<>();
     SubsetHelper(nums,0,curr,ans);
     return ans;

    }
}
