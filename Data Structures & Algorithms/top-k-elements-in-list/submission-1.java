class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //freq map
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.count-a.count);
        for(Map.Entry<Integer,Integer> ele:mp.entrySet()){
            Pair p=new Pair(ele.getKey(),ele.getValue());
            pq.add(p);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().value;
        }
        return res;

    }
    class Pair{
        public int value;
        public int count;
        public Pair(int value,int count){
            this.value=value;
            this.count=count;
        }
    }
}
