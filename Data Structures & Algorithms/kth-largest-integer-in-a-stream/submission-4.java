class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.pq=new PriorityQueue<>();
        this.k=k;
        for(int n:nums){
            pq.add(n);
            while(pq.size()>k){
                pq.poll();
            }
        }

    }
    
    public int add(int val) {
        pq.offer(val);
        if(this.pq.size()>this.k){
            this.pq.poll();
        }
        return pq.peek();
    }
}
