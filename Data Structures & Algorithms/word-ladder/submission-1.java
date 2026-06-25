class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        Set<String> visited=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        visited.add(beginWord);
        while(q.size()>0){
            Pair curr=q.poll();
            String word=curr.getWord();
            int dist=curr.getDist();
            if(word.equals(endWord)) return dist;
            for(int i=0;i<word.length();i++){
                char[] c=word.toCharArray();
                for(int j=0;j<26;j++){
                    c[i]=(char)(j+'a');
                    String temp=new String(c);
                    if(dict.contains(temp) && !visited.contains(temp)){
                        visited.add(temp);
                        q.add(new Pair(temp,dist+1));
                    }
                }
                c[i]=word.charAt(i);
            }
        }
        return 0;
    }
}
public class Pair{
    String word;
    int dist;
    public Pair(String word,int dist){
        this.word=word;
        this.dist=dist;
    }
    public String getWord(){
        return word;
    }
    public int getDist(){
        return dist;
    }
    
}
