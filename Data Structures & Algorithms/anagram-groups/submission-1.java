class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String curr=strs[i];
            char[] arr=curr.toCharArray();
            Arrays.sort(arr);
            String newString=new String(arr);
            if(mp.containsKey(newString)){
                mp.get(newString).add(curr);
            }else{
                mp.put(newString,new ArrayList<>());
                mp.get(newString).add(curr);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> curr:mp.entrySet()){
            res.add(curr.getValue());
        }
        return res;
    }

}
