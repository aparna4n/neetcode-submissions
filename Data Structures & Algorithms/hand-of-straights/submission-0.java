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

        for(int m:hand){
            if(mp.get(m)>0){
                for(int i=m;i<m+groupSize;i++){
                    if(mp.getOrDefault(i,0)==0){
                        return false;
                    }
                    mp.put(i,mp.get(i)-1);
                }
            }
        }
        return true;
    }
}
