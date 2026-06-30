class Solution {
    public int solution(int[][] board) {
        int[][] direct = new int[][]{{-1,-1}, {-1,0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] new_board = new int[board.length+2][board.length+2];
        for (int i = 1; i < new_board.length-1; i++)
            for (int j = 1; j < new_board.length-1; j++)
                if (board[i-1][j-1] == 1)
                    for (int[] d : direct)
                        new_board[i+d[0]][j+d[1]] = 1;
                    
        int total = 0;
        for (int i = 1; i < new_board.length-1; i++)
            for (int j = 1; j < new_board.length-1; j++)
                if (new_board[i][j] == 0)
                    total++;
        return total;
    }
}