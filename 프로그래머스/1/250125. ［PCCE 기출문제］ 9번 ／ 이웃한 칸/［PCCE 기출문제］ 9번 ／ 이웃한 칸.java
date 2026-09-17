class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int[][] direct = {{0,1}, {0,-1}, {-1,0}, {1,0}};
        int count = 0;
        for (int i = 0; i < direct.length; i++){
            int next_row = h + direct[i][1];
            int next_col = w + direct[i][0];
            if (next_row < 0 || next_row >= n || next_col < 0 || next_col >= n)
                continue;
            if (board[h][w].equals(board[next_row][next_col])) {
                count++;
            }
        }
        return count;
    }
}