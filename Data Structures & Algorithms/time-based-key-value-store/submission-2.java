class TimeMap {
    Map<String,List<Pair>> mp;

    public TimeMap() {
        mp=new HashMap<>();   
    }
    
    public void set(String key, String value, int timestamp) {
        mp.putIfAbsent(key,new ArrayList<>());
        mp.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!mp.containsKey(key)) return "";
        List<Pair> p=mp.get(key);
        int lo=0,hi=p.size()-1;
        while(lo<hi){
            int mid=lo+(hi-lo+1)/2;
            if(p.get(mid).time<=timestamp){
                lo=mid;
            }else{
                hi=mid-1;
            }
            
        }
        if(p.get(lo).time<=timestamp)
        return p.get(lo).value;
        else return "";
    }
}
class Pair{
    public int time;
    public String value;
    public Pair(String value,int time){
        this.time=time;
        this.value=value;
    }
}
