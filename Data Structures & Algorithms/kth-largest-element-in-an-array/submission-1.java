class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int m:nums){
            pq.add(m);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
