class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        char[] c=s.toCharArray();
        List<Integer> res=new ArrayList<>();
        Map<Character,Integer> lastIndex=new HashMap<>();
        for(int i=0;i<n;i++){
            lastIndex.put(c[i],i);
        }
        int size=0, end=0;
        for(int i=0;i<s.length();i++){
            size++;
            end=Math.max(end,lastIndex.get(c[i]));
            if(i==end){
                res.add(size);
                size=0;
            }
        }
        return res;
    }
}
