class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(Map.Entry<Integer,Integer> ele: mp.entrySet()){
            int key=ele.getKey();
            int freq=ele.getValue();

            maxHeap.add(new int[]{freq,key});
        }
        int[] ans=new int[k];
        int i=0;
        while(maxHeap.size()>0 && k-->0){
            int[] curr=maxHeap.poll();
            ans[i]=curr[1];
            i++;
        }
        return ans;
    }
}
