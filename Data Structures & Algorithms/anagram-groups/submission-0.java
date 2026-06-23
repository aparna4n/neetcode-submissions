class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;

        Map<String,List<String>> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray); 
            if(!mp.containsKey(key)){
              mp.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
            }else{
                mp.get(key).add(strs[i]);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> ele:mp.entrySet()){
            String key=ele.getKey();
            res.add(ele.getValue());
            for(String val:ele.getValue()){
                System.out.println(val + ":");
            }
        }
        return res;
    }

}
