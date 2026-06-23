class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;

        int outLo=0,outHi=n-1;
        int lo=0,hi=m-1;
        while(outLo<outHi){
            int outMid=outLo+(outHi-outLo)/2;
            if(matrix[outMid][m-1]<target){
                outLo=outMid+1;
            }else{
                outHi=outMid;
            }
        }
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(matrix[outLo][mid]<target){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        if(matrix[outLo][lo]==target) return true;
        return false;
    }
}
