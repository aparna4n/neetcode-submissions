class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
       this.minHeap=new PriorityQueue<>();
       this.k=k;
       for(int num:nums){
        minHeap.offer(num);
        if(minHeap.size()>k){
            minHeap.poll();
        }
       }
 
    }
    
    public int add(int val) {
        this.minHeap.offer(val);
        if(this.minHeap.size()>this.k) this.minHeap.poll();
        return minHeap.peek();
    }
}
