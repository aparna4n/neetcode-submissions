class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows=new boolean[9][10];
        boolean[][] cols=new boolean[9][10];
        boolean[][] boxs=new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;                
                int val=(int) board[i][j]-'0';
                if(rows[i][val]) return false;
                if(cols[j][val]) return false;
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(boxs[boxIndex][val]) return false;
                rows[i][val]=true;
                cols[j][val]=true;
                boxs[boxIndex][val]=true;
            }
        }
        return true;
    }
}
