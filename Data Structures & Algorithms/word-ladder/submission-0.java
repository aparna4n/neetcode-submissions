class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        Set<String> visited=new HashSet<>();

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        visited.add(beginWord);
        while(q.size()>0){
            Pair curr=q.poll();
            String word=curr.word;
            int dist=curr.dist;
            if(word.equals(endWord)) return dist;
            char[] temp=word.toCharArray();
            for(int i=0;i<temp.length;i++){
                for(int j=0;j<26;j++){
                    temp[i]=(char)(j+'a');
                    String tempp=new String(temp);
                    if(!visited.contains(tempp) && dict.contains(tempp)){
                        visited.add(tempp);
                        q.add(new Pair(tempp,dist+1));
                    }
                }
                temp[i]=word.charAt(i);
            }

        }
        return 0;
    }
}
class Pair{
    int dist;
    String word;
    public Pair(String word,int dist){
        this.word=word;
        this.dist=dist;
    }
}
