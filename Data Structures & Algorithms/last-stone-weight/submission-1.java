class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<n){
            maxHeap.add(stones[i]);
            i++;
        }
        //simulation
        while(maxHeap.size()>1){
            int firstStone=maxHeap.poll();
            int secondStone=maxHeap.poll();
            if(firstStone==secondStone){
                continue;
            }
            int diff=Math.abs(firstStone-secondStone);
            maxHeap.add(diff);
        }
        if(maxHeap.size()>0) return maxHeap.peek();
        return 0;
    }
}
