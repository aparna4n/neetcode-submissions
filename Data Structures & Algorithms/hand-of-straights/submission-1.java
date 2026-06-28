class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(groupSize==1) return true;
        if(n%groupSize!=0) return false;
        Map<Integer,Integer> mp=new HashMap<>();
        Arrays.sort(hand);
        for(int m:hand){
            mp.put(m,mp.getOrDefault(m,0)+1);
        }
        PriorityQueue<Integer> minH=new PriorityQueue<>(mp.keySet());
        
        while(!minH.isEmpty()){
            int first=minH.peek();
            for(int i=first;i<first+groupSize;i++){
                if(!mp.containsKey(i)) return false;
                mp.put(i,mp.get(i)-1);
                if(mp.get(i)==0){
                    if(i!=minH.peek()){
                        return false;
                    }
                    minH.poll();
                }
            }
        }
        return true;
    }
}
