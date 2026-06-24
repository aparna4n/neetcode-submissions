class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int currTemp=temperatures[i];
            while(!stack.isEmpty() && currTemp>temperatures[stack.peek()]){
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);

        }
        return ans;

    }
}
