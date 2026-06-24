class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int n=stones.length;
        for(int i=0;i<n;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int fir=pq.poll();
            int sec=pq.poll();
            if(fir==sec){
                pq.add(0);
            }else
            pq.add(Math.abs(fir-sec));
        }
        return pq.peek();
    }
}
