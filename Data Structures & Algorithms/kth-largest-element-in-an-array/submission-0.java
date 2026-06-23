class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        int i=0;
        while(i<n){
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k) maxHeap.poll();
            i++;
        }
        int ans=-1;
        if(maxHeap.size()>0) ans=maxHeap.poll();
        return ans;
    }
}
