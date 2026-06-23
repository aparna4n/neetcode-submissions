class Solution {

    public int dfs(int[] coins,int index,int target,int[][] memo){
        if(target==0) return 1;       
        if(index>=coins.length) return 0;
        if(memo[index][target]!=-1) return memo[index][target];
        
        int res=0;
        //skip the ele
        if(target>=coins[index]){
            res=dfs(coins,index+1,target,memo);
            res+=dfs(coins,index,target-coins[index],memo);
        }
        memo[index][target]=res;
        return res;
    }
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int[][] memo=new int[coins.length+1][amount+1];

        for(int[] row:memo){
            Arrays.fill(row,-1);
        }
        return dfs(coins,0,amount,memo);
    }

}
